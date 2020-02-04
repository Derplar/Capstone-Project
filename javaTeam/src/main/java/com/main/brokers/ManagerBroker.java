/**
 * Class Description: This class acts as the intermediary between the database and Manager actions.
 */
package com.main.brokers;

import com.main.bokerInterfaces.ManagerBrokerInterface;
import com.main.menu.Order;

/**
 * @author Cuong Nguyen, Chris Boot, Nguyen Khanh Duy Phan, Shawn Kaldenbach
 * @version 1.1
 */
public class ManagerBroker implements ManagerBrokerInterface {

	/**
	 * Goes into the database and updates 
	 * an order row with the parameter order being tossed in.
	 * @param order
	 * @throws NullPointerException when the parameter order is empty
	 */
	@Override
	public void voidOrder(Order order) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

}
