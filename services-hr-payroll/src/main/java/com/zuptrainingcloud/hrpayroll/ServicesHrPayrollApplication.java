package com.zuptrainingcloud.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServicesHrPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesHrPayrollApplication.class, args);
	}

}
