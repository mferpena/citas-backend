package pe.citas.app.infra.secondary.persistence.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pe.citas.app.infra.secondary.persistence.entities.AccountEntity;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<AccountEntity, String> {
    Mono<AccountEntity> findByEmail(String email);
}
