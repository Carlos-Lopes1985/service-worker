package com.hruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServicesHrUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesHrUserApplication.class, args);
	}

}
