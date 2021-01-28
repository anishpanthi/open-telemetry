package net.app.opentelemetry.service.b;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Anish Panthi
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ServiceB {

  private final UserRepository userRepository;

  public List<UserEntity> findAll() {
    List<UserEntity> userEntityList = userRepository.findAll();
    log.info("List of Users: {}", userEntityList);
    return userEntityList;
  }
}
