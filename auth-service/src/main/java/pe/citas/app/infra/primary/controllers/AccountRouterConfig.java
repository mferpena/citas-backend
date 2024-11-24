package pe.citas.app.infra.primary.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import pe.citas.app.core.usecases.AccountUseCase;

@Configuration
@RequiredArgsConstructor
public class AccountRouterConfig {
    private final AccountUseCase accountUseCase;
}
