package net.app.opentelemetry.service.a;

import java.util.Collections;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Anish Panthi
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class ControllerA {

  private final RestTemplate restTemplate;

  @GetMapping(value = "/service-a", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> controllerAMethod() {
    log.info("Inside controllerAMethod() ...");
    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    HttpEntity<String> entity = new HttpEntity<>(headers);
    String response = restTemplate
        .exchange("http://localhost:9092/service-b", HttpMethod.GET, entity, String.class)
        .getBody();

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

}
