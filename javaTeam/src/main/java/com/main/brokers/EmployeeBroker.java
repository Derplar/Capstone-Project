/**
 * Class Description: This class acts as the intermediary between the database and Employee actions.
 */
package com.main.brokers;

import java.util.List;

import com.main.bokerInterfaces.EmployeeBrokerInterface;
import com.main.menu.Order;



/**
 * @author Cuong Nguyen, Chris Boot, Nguyen Khanh Duy Phan, Shawn Kaldenbach
 * @version 1.1
 */
public class EmployeeBroker implements EmployeeBrokerInterface {

	/**
	 * Goes into the database and updates an order row 
	 * with the parameter Order being tossed in.
	 * @param Order order
	 * @throws NullPointerException when the parameter order is empty
	 */
	@Override
	public void changeStatus(Order order) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Goes into the database and gets the order 
	 * that has the same order ID as the parameter orderID
	 * Then, construct a new Order object based on 
	 * the row retrieved and return it.
	 * @param int orderID
	 * @return Order
	 * @throws NullPointerException when the parameter orderID is empty.
	 * @throws IndexOutOfBoundsException if the orderID < 0 or greater than the maximum of orderIDs
	 */
	@Override
	public Order get(int orderID) throws NullPointerException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Goes into the database and gets all rows of orders 
	 * that do not have the status of Complete.
	 * Then, construct new Order objects with 
	 * the retrieved data and return the list.
	 * @return List<?>
	 */
	@Override
	public List<?> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
