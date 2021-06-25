package com.hruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.hruser.repositories.RoleRepository;
import com.hruser.repositories.UserRepository;

@EnableEurekaClient
@SpringBootApplication
public class ServicesHrUserApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(ServicesHrUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
