package pe.citas.app.core.usecases;

import pe.citas.app.core.domain.models.auth.SignIn;
import pe.citas.app.core.domain.models.auth.SignUp;
import pe.citas.app.core.domain.models.auth.AuthSuccess;

public interface AuthUseCase {
    AuthSuccess signUp(SignUp signUp);

    AuthSuccess signIn(SignIn signIn);
}
