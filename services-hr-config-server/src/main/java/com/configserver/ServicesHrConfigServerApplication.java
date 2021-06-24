package com.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServicesHrConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesHrConfigServerApplication.class, args);
	}

}
