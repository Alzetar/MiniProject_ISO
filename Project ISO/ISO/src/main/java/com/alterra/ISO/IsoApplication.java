package com.alterra.ISO;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class IsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsoApplication.class, args);
	}

}