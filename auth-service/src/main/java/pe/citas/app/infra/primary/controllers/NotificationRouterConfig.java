package pe.citas.app.infra.primary.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import pe.citas.app.core.usecases.NotificationUseCase;

@Configuration
@RequiredArgsConstructor
public class NotificationRouterConfig {
    private final NotificationUseCase notificationUseCase;
}
