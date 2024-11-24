package pe.citas.app.infra.secondary.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.citas.app.core.ports.JwtSecurityPort;
import pe.citas.app.infra.secondary.security.config.SecurityProperties;

import java.security.Key;
import java.util.Base64;

@Service
@RequiredArgsConstructor
@SuppressWarnings("all")
public class JwtSecurity implements JwtSecurityPort {
    private final SecurityProperties securityProperties;

    private Key getSigningKey() {
        byte[] keyBytes = Base64
                .getDecoder()
                .decode(securityProperties.getSecret());
        return Keys.hmacShaKeyFor(keyBytes);
    }

    @Override
    public String generateToken(String subject, long expirationMillis) {
        long now = System.currentTimeMillis();
        long expiration = now + expirationMillis;

        return Jwts.builder()
                .claim("sub", subject)
                .claim("iat", now)
                .claim("exp", expiration)
                .signWith(getSigningKey())
                .compact();
    }

    @Override
    public boolean validateToken(String token) {
        try {
            Jws<Claims> jws = Jwts.parser()
                    .setSigningKey(getSigningKey())
                    .build()
                    .parseClaimsJws(token);
            return jws.getBody() != null;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String getSubject(String token) {
        Jws<Claims> jws = Jwts.parser()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token);
        return jws.getBody().getSubject();
    }
}
