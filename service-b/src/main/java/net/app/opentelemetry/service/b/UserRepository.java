package net.app.opentelemetry.service.b;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Anish Panthi
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
