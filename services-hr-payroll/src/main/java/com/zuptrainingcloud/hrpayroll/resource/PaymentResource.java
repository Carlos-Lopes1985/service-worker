package com.zuptrainingcloud.hrpayroll.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zuptrainingcloud.hrpayroll.entity.Payment;
import com.zuptrainingcloud.hrpayroll.service.PaymentService;

@RestController
@RequestMapping(value="/payments")
public class PaymentResource {

	@Autowired
	private PaymentService paymentService;
	
	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping(value="/{workedId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workedId,@PathVariable Integer days){
		return ResponseEntity.ok().body(paymentService.getPayment(workedId, days));
	}
	
	public ResponseEntity<Payment> getPaymentAlternative( Long workedId, Integer days){
		Payment payment = new Payment("Brann",200.,10);
		return ResponseEntity.ok(payment);
	}
}
