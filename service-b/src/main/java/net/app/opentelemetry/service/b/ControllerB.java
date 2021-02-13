package net.app.opentelemetry.service.b;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anish Panthi
 */
@RestController
@RequiredArgsConstructor
@Log4j2
public class ControllerB {

  private final ServiceB serviceB;

  @GetMapping(value = "/service-b", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> controllerBMethod() {
    log.info("Inside controllerBMethod...");
    log.debug("Inside controllerBMethod...");
    return new ResponseEntity<>(serviceB.findAll(), HttpStatus.OK);
  }

}
