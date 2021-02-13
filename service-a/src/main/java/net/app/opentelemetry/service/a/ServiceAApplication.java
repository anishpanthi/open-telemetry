package net.app.opentelemetry.service.a;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);

		Logger logger = LogManager.getLogger();
		logger.info("Welcome to 3rd session of JPG.");
	}

}
