package com.zuptrainingcloud.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuptrainingcloud.hrpayroll.WorkerFeignClient;
import com.zuptrainingcloud.hrpayroll.entity.Payment;
import com.zuptrainingcloud.hrpayroll.entity.Worker;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerfeignClient;
	
	public Payment getPayment(long workerId,int days) {
		
		Worker worker = workerfeignClient.findById(workerId).getBody();
		return new Payment(worker.getNome(),worker.getSalarioDiario(),days);
	}
	
	
	
}
