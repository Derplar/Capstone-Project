package com.main.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.actor.Customer;
import com.main.brokers.AdminBroker;

@RestController
@RequestMapping("/adminrest")
public class AdminRestControl {

	@PostMapping("/getCustomer/{cusId}")
	public Customer getCustomerById(@PathVariable("cusId") int cusId)
	{
		
		
		AdminBroker ab = new AdminBroker();
		Customer cus = ab.getCustomer(cusId);
		
		return cus;
		
	}
}
