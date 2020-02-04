/**
 * Class Description: This class acts as the intermediary between the database and Actor actions
 */
package com.main.brokers;

import com.main.bokerInterfaces.ActorBrokerInterface;

/**
 * @author Cuong Nguyen, Chris Boot, Nguyen Khanh Duy Phan, Shawn Kaldenbach
 * @version 1.1
 */
public class ActorBroker implements ActorBrokerInterface {

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
	@Override
	public boolean checkCredential(String email, String password) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

}
