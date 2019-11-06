package org.springframework.internalrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InternalRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternalRestapiApplication.class, args);
	}

}
