package pe.citas.app.core;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.citas.app.core.domain.models.auth.SignIn;
import pe.citas.app.core.domain.models.auth.SignUp;
import pe.citas.app.core.domain.models.auth.AuthSuccess;
import pe.citas.app.core.ports.AuthPersistencePort;
import pe.citas.app.core.usecases.AuthUseCase;
import pe.citas.app.core.usecases.TokenUseCase;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthUseCase {
    private final TokenUseCase tokenUseCase;
    private final AuthPersistencePort authPersistencePort;

    @Override
    public AuthSuccess signUp(SignUp signUp) {
        String subject = authPersistencePort.signUp(signUp);
        String token = tokenUseCase.generateToken(subject, 3600000);
        return AuthSuccess.builder()
                .statusCode(200)
                .message("Sign up successful")
                .token(token)
                .build();
    }

    @Override
    public AuthSuccess signIn(SignIn signIn) {
        String subject = authPersistencePort.signIn(signIn);
        boolean isValid = tokenUseCase.validateToken(subject);
        if (isValid) {
            String token = tokenUseCase.generateToken(subject, 3600000);
            return AuthSuccess.builder()
                    .statusCode(200)
                    .message("Sign in successful")
                    .token(token)
                    .build();
        } else {
            throw new IllegalArgumentException("Invalid credentials");
        }
    }
}
