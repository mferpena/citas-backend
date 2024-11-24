package pe.citas.app.core.domain.models.auth;

import lombok.Data;

@Data
public class SignIn {
    private String identifier;
    private String password;
}
