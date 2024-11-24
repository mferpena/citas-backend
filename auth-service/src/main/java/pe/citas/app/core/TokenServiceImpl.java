package pe.citas.app.core;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.citas.app.core.ports.JwtSecurityPort;
import pe.citas.app.core.usecases.TokenUseCase;

@Service
@RequiredArgsConstructor
public class TokenServiceImpl implements TokenUseCase {
    private final JwtSecurityPort jwtSecurityPort;

    @Override
    public String generateToken(String subject, long expirationMillis) {
        return jwtSecurityPort.generateToken(subject, expirationMillis);
    }

    @Override
    public boolean validateToken(String token) {
        return jwtSecurityPort.validateToken(token);
    }

    @Override
    public String getSubject(String token) {
        return jwtSecurityPort.getSubject(token);
    }
}
