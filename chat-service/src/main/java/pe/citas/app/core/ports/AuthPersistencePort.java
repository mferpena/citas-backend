package pe.citas.app.core.ports;

import pe.citas.app.core.domain.models.auth.SignIn;
import pe.citas.app.core.domain.models.auth.SignUp;

public interface AuthPersistencePort {
    String signIn(SignIn signIn);

    String signUp(SignUp signUp);
}
