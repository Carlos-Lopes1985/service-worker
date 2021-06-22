package com.zuptrainingcloud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuptrainingcloud.entity.Worker;
import com.zuptrainingcloud.repository.WorkerRepository;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository workerRepository;
	
	public List<Worker>getAllWorker(){
		return workerRepository.findAll();
	}

	public Optional<Worker> getByIdWorker(Long id) {
		return workerRepository.findById(id);
	}
}
