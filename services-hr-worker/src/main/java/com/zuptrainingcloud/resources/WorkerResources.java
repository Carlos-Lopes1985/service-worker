package com.zuptrainingcloud.resources;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuptrainingcloud.entity.Worker;
import com.zuptrainingcloud.service.WorkerService;

@RestController
@RequestMapping(value="/workers")
public class WorkerResources {
	
	private static Logger Logger = LoggerFactory.getLogger(WorkerResources.class);
	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerService workerService;
	
	@GetMapping
	public ResponseEntity<List<Worker>>findAll(){
		return ResponseEntity.ok().body(workerService.getAllWorker());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Optional<Worker>> findById(@PathVariable Long id){
	
		Logger.info("PORT: "+ env.getProperty("local.server.port"));
		
		return ResponseEntity.ok().body(workerService.getByIdWorker(id));
	}
}
