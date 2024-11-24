package pe.citas.app.core.usecases;

public interface TokenUseCase {
    String generateToken(String subject, long expirationMillis);

    boolean validateToken(String token);

    String getSubject(String token);
}
