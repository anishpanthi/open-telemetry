package net.app.opentelemetry.service.a;

import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.tag.Tags;
import io.opentracing.util.GlobalTracer;
import java.util.Collections;
import lombok.RequiredArgsConstructor;
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
public class ControllerA {

  private final RestTemplate restTemplate;

  @GetMapping(value = "/service-a", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> controllerAMethod() {

    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    HttpEntity<String> entity = new HttpEntity<>(headers);
    String response = restTemplate
        .exchange("http://localhost:9092/service-b", HttpMethod.GET, entity, String.class).getBody();

    // Below code demonstrate the custom trace creation
//    Tracer tracer = GlobalTracer.get();
//    Tracer.SpanBuilder spanBuilder = tracer.buildSpan("CustomSpan")
//        .withTag(Tags.SPAN_KIND.getKey(), Tags.SPAN_KIND_SERVER);
//
//    Span span = spanBuilder.start();
//    Tags.COMPONENT.set(span, "ControllerA");
//    span.setTag("tag-a", "test");
//    span.finish();

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

}
