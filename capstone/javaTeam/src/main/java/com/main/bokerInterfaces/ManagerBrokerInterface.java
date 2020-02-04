/**
 * Class Description: This class acts as the intermediary between the database and Manager actions.
 */
package com.main.bokerInterfaces;

import com.main.menu.*;

/**
 * @author Cuong Nguyen, Chris Boot, Nguyen Khanh Duy Phan, Shawn Kaldenbach
 * @version 1.1
 */
public interface ManagerBrokerInterface {

	/**
	 * Goes into the database and updates 
	 * an order row with the parameter order being tossed in.
	 * @param order
	 * @throws NullPointerException when the parameter order is empty
	 */
	public void voidOrder(Order order) throws NullPointerException;
}
