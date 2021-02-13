package net.app.opentelemetry.service.b;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Anish Panthi
 */
@Service
@RequiredArgsConstructor
@Log4j2
public class ServiceB {

  private final UserRepository userRepository;

  @SneakyThrows
  public List<UserEntity> findAll() {
    Thread.sleep(500);
    List<UserEntity> userEntityList = userRepository.findAll();
    log.info("List of Users: {}", userEntityList);
    return userEntityList;
  }
}
