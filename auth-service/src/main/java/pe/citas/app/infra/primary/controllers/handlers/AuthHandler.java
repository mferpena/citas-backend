package pe.citas.app.infra.primary.controllers.handlers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import pe.citas.app.core.domain.models.auth.SignIn;
import pe.citas.app.core.domain.models.auth.SignUp;
import pe.citas.app.core.usecases.AuthUseCase;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class AuthHandler {
    private final AuthUseCase authUseCase;

    public Mono<ServerResponse> handleSignUp(ServerRequest request) {
        return request.bodyToMono(SignUp.class)
                .map(authUseCase::signUp)
                .flatMap(authSuccess -> ServerResponse.ok().bodyValue(authSuccess))
                .onErrorResume(e -> ServerResponse.badRequest().bodyValue(e.getMessage()));
    }

    public Mono<ServerResponse> handleSignIn(ServerRequest request) {
        return request.bodyToMono(SignIn.class)
                .map(authUseCase::signIn)
                .flatMap(authSuccess -> ServerResponse.ok().bodyValue(authSuccess))
                .onErrorResume(e -> ServerResponse.badRequest().bodyValue(e.getMessage()));
    }
}
