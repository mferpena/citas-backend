package pe.citas.app.core.domain.models.auth;

import lombok.Data;

@Data
public class SignUp {
    private String nickname;
    private String email;
    private String password;
}
