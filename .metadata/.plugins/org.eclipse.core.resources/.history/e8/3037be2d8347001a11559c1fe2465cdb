/**
 * Class Description: This class acts as the intermediary between the database and Actor actions
 */
package com.main.bokerInterfaces;


/**
 * @author Cuong Nguyen, Chris Boot, Nguyen Khanh Duy Phan, Shawn Kaldenbach
 * @version 1.1
 */
public interface ActorBrokerInterface {

	/**
	 * Goes into the database and verifies that 
	 * the current Actor exists in the database. 
	 * If they exist, return true. Otherwise return false.
	 * @param String email
	 * @param String password
	 * @return true if the credential exist
	 * 			no, otherwise.
	 * @throws NullPointerException if either email or password is empty
	 */
	public boolean checkCredential(String email, String password) throws NullPointerException;
}
