package com.hruser;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.hruser.entity.Role;
import com.hruser.entity.User;
import com.hruser.repositories.RoleRepository;
import com.hruser.repositories.UserRepository;

@EnableEurekaClient
@SpringBootApplication
public class ServicesHrUserApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ServicesHrUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Role r1 = new Role(null,"ROLE_OPERATOR");
//		Role r2 = new Role(null,"ROLE_ADMIN");
//		
//		roleRepository.saveAll(Arrays.asList(r1,r2));
//		
//		User u1 = new User(null,"Carlos","ca@gmail.com","123");
//		User u2 = new User(null,"Carlos","ca@gmail.com","123");
//		
//		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}

}
