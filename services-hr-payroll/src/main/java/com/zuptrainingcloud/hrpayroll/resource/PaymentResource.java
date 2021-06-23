package com.zuptrainingcloud.hrpayroll.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuptrainingcloud.hrpayroll.entity.Payment;
import com.zuptrainingcloud.hrpayroll.service.PaymentService;

@RestController
@RequestMapping(value="/payments")
public class PaymentResource {

	@Autowired
	private PaymentService paymentService;
	
	@GetMapping(value="/{workedId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workedId,@PathVariable Integer days){
		return ResponseEntity.ok().body(paymentService.getPayment(workedId, days));
	}
}
