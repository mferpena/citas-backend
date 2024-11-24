package pe.citas.app.infra.secondary.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.citas.app.core.domain.models.auth.SignIn;
import pe.citas.app.core.domain.models.auth.SignUp;
import pe.citas.app.core.ports.AuthPersistencePort;

@Service
@RequiredArgsConstructor
public class AuthPersistenceImpl implements AuthPersistencePort {
    @Override
    public String signIn(SignIn signIn) {
        return "";
    }

    @Override
    public String signUp(SignUp signUp) {
        return "";
    }
}
