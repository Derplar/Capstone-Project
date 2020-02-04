/**
 * Class Description: This class acts as the intermediary between the database and Report actions.
 */
package com.main.brokers;

import java.util.Date;

import java.util.List;

import com.main.bokerInterfaces.ReportBrokerInterface;



/**
 * @author Cuong Nguyen, Chris Boot, Nguyen Khanh Duy Phan, Shawn Kaldenbach
 * @version 1.1
 */
public class ReportBroker implements ReportBrokerInterface {

	/**
	 * Calculates the total income of the store based on
	 *  the range of the dates being tossed in 
	 *  And returns that value.
	 *  @param Date start
	 *  @param Date end
	 *  @return double  
	 *  @throws NullPointerException when either start or end is empty
	 */
	@Override
	public double calculateTotals(Date start, Date end) throws NullPointerException {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Goes into the database and retrieves all Items, 
	 * Then construct Item objects based on the retrieved data and return the list.
	 * @return List<?>
	 */
	@Override
	public List<?> getAllItem() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Goes into the database and retrieves all rows of Orders 
	 * based on the range of the dates being tossed in
	 * Then, construct Order objects based on 
	 * the retrieved data and return the list.
	 * @param Date start
	 * @param Date end
	 * @return List<?>
	 * @throws NullPointerException when either start or end is empty
	 */
	@Override
	public List<?> getAllOrder(Date start, Date end) throws NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}


}
