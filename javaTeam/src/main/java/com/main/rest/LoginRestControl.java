/**
 * 
 */
package com.main.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.users.request.LoginRequest;
import com.main.users.response.LoginResponse;

/**
 * @author cuong
 *
 */
@RestController
@RequestMapping("/login")
public class LoginRestControl {

	@PostMapping
	private LoginResponse actorLogin(LoginRequest loginRequest)
	{
		 LoginResponse loginResponse = new LoginResponse();
		 
		 
		 
		 
		 
		 return loginResponse;
	}
	
	
	private boolean checkCredential(String email, String password)
	{
		
		
		
		return false;
	}
	

	
	
	
}
