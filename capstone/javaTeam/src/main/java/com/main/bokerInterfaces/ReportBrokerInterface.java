/**
 * Class Description: This class acts as the intermediary between the database and Report actions.
 */
package com.main.bokerInterfaces;

import java.util.Date;
import java.util.List;

/**
 * @author Cuong Nguyen, Chris Boot, Nguyen Khanh Duy Phan, Shawn Kaldenbach
 * @version 1.1
 */
public interface ReportBrokerInterface {
	
	/**
	 * Calculates the total income of the store based on
	 *  the range of the dates being tossed in 
	 *  And returns that value.
	 *  @param Date start
	 *  @param Date end
	 *  @return double  
	 *  @throws NullPointerException when either start or end is empty
	 */
	public double calculateTotals(Date start, Date end) throws NullPointerException;
	
	/**
	 * Goes into the database and retrieves all Items, 
	 * Then construct Item objects based on the retrieved data and return the list.
	 * @return List<?>
	 */
	public List<?> getAllItem();
	
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
	public List<?> getAllOrder(Date start, Date end) throws NullPointerException;
}
