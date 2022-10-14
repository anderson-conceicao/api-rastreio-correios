package com.dev.apirastreiocorreios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiRastreioCorreiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRastreioCorreiosApplication.class, args);
	}
	// Annotation  
	@Bean

	// Method 
	public RestTemplate restTemplate() 
	{
	 return new RestTemplate();
	}
}
