/**
 * 
 */
package com.main.users.response;

/**
 * @author cuong
 *
 */
public class LoginResponse {

	private boolean checkingLogin; 
	private String  role; 
	private boolean state;
	
	
	public boolean isCheckingLogin() {
		return checkingLogin;
	}
	public void setCheckingLogin(boolean checkingLogin) {
		this.checkingLogin = checkingLogin;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	
	
	
	
}
