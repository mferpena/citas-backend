package pe.citas.app.infra.secondary.security.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data
@Configuration
@ConfigurationProperties(prefix = "jwt")
public class SecurityProperties {
    private String secret;
    private long expirationMillis;

//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
