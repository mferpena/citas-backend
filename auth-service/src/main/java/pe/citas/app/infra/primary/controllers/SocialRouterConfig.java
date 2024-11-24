package pe.citas.app.infra.primary.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import pe.citas.app.core.usecases.SocialUseCase;

@Configuration
@RequiredArgsConstructor
public class SocialRouterConfig {
    private final SocialUseCase socialUseCase;
}
