package pe.citas.app.core.ports;

public interface JwtSecurityPort {
    String generateToken(String subject, long expirationMillis);

    boolean validateToken(String token);

    String getSubject(String token);
}
