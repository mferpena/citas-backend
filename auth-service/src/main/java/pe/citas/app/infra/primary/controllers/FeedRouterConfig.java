package pe.citas.app.infra.primary.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import pe.citas.app.core.usecases.FeedUseCase;

@Configuration
@RequiredArgsConstructor
public class FeedRouterConfig {
    private final FeedUseCase feedUseCase;
}
