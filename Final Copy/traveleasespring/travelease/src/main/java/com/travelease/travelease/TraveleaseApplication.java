package com.travelease.travelease;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.javatute")
@SpringBootApplication
@EntityScan("com.javatute.*")

public class TraveleaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraveleaseApplication.class, args);
	}

}
