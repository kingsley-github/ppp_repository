package com.citi.beservice.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.beservice.pojo.PaymentDetails;


@RestController
public class BEController {
	
	@GetMapping("/")
	public String display() {
		return "Welcome to BE-Service !!!";
	}
	@GetMapping("/text-data")
	public String getText() {
		return "BE Service Text Data ";
	}
	@GetMapping("/payment-data")
	public PaymentDetails getPaymentDetails() {
		return new PaymentDetails(1, 10000, new Date());
	}
}
