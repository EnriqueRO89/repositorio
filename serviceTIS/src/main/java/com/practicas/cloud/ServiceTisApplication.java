package com.practicas.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceTisApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ServiceTisApplication.class, args);
	}

}
