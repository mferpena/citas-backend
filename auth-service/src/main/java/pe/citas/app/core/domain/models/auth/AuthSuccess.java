package pe.citas.app.core.domain.models.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthSuccess {
    private int statusCode;
    private String message;
    private String token;
}
