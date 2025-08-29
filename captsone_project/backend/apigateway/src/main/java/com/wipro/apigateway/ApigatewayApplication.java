package com.wipro.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableDiscoveryClient
@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200")
public class ApigatewayApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}
 
}
