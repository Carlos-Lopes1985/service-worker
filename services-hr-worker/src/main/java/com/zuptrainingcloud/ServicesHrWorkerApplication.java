package com.zuptrainingcloud;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zuptrainingcloud.entity.Worker;
import com.zuptrainingcloud.repository.WorkerRepository;

@SpringBootApplication
public class ServicesHrWorkerApplication implements CommandLineRunner{

	@Autowired
	private WorkerRepository workerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ServicesHrWorkerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Worker worker = new Worker(null, "Carlos", 200.);
		Worker worker2 = new Worker(null, "Roberto", 500.);
		Worker worker3 = new Worker(null, "Paula", 400.);
		Worker worker4 = new Worker(null, "Carla", 300.);
		
		workerRepository.saveAll(Arrays.asList(worker, worker2,worker3,worker4));
	}

	
}
