package com.wipro.paymentms1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Paymentms1Application {

	public static void main(String[] args) {
		SpringApplication.run(Paymentms1Application.class, args);
	}

}
