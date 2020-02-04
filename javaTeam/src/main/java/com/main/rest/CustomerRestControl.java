/**
 * 
 */
package com.main.rest;

import java.util.Date;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.main.brokers.*;
import com.main.actor.*;



/**
 * @author cuong
 *
 */
@RestController
@RequestMapping("/cusrest")
public class CustomerRestControl {

	@PostMapping("/cusinsert")
	/*
	public String insertCustomer(@PathVariable("ln")String lastName,@PathVariable("fn")String firstName,@PathVariable("street") String street, 
								@PathVariable("hn")String houseNumber,@PathVariable("un")String unitNumber,@PathVariable("city")String city, @PathVariable("province") String province
								,@PathVariable("postalcode") String postalCode,@PathVariable("country") String country,@PathVariable("phoneNumber") String phoneNumber,
								@PathVariable("email")String email,@PathVariable("password") String password,@PathVariable("birthdate") int dateOfBirth)
	*/
	public Actor insertCustomer(@RequestBody Actor newCust)
	{
		
		return newCust;
		
		/*
			Customer cus = new Customer(0, "C", lastName, firstName, 
					            street, houseNumber, unitNumber, city,
					            province, postalCode, country, phoneNumber, 
					            email, password, 1234 , true);
			CustomerBroker cb = new CustomerBroker();
			cb.insertCustomer(cus);
	
				return "ken";
		*/
		
	
		
	}
//	@PostMapping("/sss")
//	public String test()
//	{
//		System.out.println("kendsadsadas");
//		return "Ken";
//	}
	
}
