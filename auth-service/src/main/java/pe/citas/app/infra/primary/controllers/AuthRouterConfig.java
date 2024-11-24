package pe.citas.app.infra.primary.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import pe.citas.app.infra.primary.controllers.handlers.AuthHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@SuppressWarnings("unused")
public class AuthRouterConfig {
    @Bean
    public RouterFunction<ServerResponse> authRoutes(AuthHandler authHandler) {
        return route(POST("/api/v1/auth/sign-up"), authHandler::handleSignUp);
    }
}
