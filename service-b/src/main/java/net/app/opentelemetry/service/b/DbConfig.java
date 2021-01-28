package net.app.opentelemetry.service.b;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Anish Panthi
 */
@Slf4j
@Configuration
@EntityScan(basePackages = {"net.app.opentelemetry.service.b"})
@EnableJpaRepositories(basePackages = "net.app.opentelemetry.service.b")
public class DbConfig {

}
