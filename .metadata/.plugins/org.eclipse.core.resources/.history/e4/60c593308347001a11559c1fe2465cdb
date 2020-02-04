/**
 * Class Description: This class acts as the intermediary
 * between the database and Administrator actions
 */
package com.main.bokerInterfaces;

import java.util.List;

import com.main.actor.*;
import com.main.menu.*;


/**
 * @author Cuong Nguyen, Chris Boot, Nguyen Khanh Duy Phan, Shawn Kaldenbach
 * @version 1.1
 *
 */
public interface AdminBrokerInterface {

	/**
	 * Gets all information in all tables, creates a new file, 
	 * saves all information to the file Then saves it to the filePath.
	 * @param String filePath
	 * @throw NullPointerException when the parameter filePath is empty.
	 */
	public void createBackUp(String filePath) throws NullPointerException;
	
	/**
	 * Goes into the database and removes a row based on
	 * the customer information being tossed in.
	 * @param Customer customer
	 * @throws NullPointerException when the parameter customer is empty
	 */
	public void deleteCustomer(Customer customer) throws NullPointerException;
	
	/**
	 * Goes into the database and removes a row based 
	 * on the employee information being tossed in.
	 * @param Employee employee
	 * @throws NullPointerException when the parameter employee is empty
	 */
	public void deleteEmployee(Employee employee) throws NullPointerException;
	
	/**
	 * Goes into the database and removes a row based 
	 * on the order information being tossed in.
	 * @param Order order
	 * @throws NullPointerException when the parameter order is empty
	 */
	public void deleteOrder(Order order) throws NullPointerException;
	
	/**
	 * Goes into the database and gets all rows in 
	 * the Orders table, constructs new Order objects 
	 * and returns that list of Orders.
	 * @return List<?>
	 */
	public List<?> getAllOrder();
	
	/**
	 * Goes into the database and gets the row from 
	 * the Actor table with the customerID, constructs
	 * a new Customer object and returns it.
	 * @param int customerID
	 * @return Customer
	 * @throws NullPointerException when the parameter customerID is empty
	 * @throws IndexOutOfBoundsException if the customerID < 0 or greater the maximum of customerIDs
	 */
	public Customer getCustomer(int customerID) throws NullPointerException, IndexOutOfBoundsException;
	
	/**
	 * Goes into the database and gets the row from 
	 * the Actor table with the employeeID, constructs 
	 * a new employee object and returns it.
	 * @param int employeeID
	 * @return Employee
	 * @throws NullPointerException when the parameter employeeID is empty
	 * @throws IndexOutOfBoundsException if the employeeIDs < 0 or greater the maximum of employeeID.
	 */
	public Employee getEmployee(int employeeID) throws NullPointerException, IndexOutOfBoundsException;
	
	/**
	 * Goes into the database and gets the row from 
	 * the Order table with the orderID, constructs 
	 * a new Order object and returns it.
	 * @param int orderID
	 * @return Order 
	 * @throws NullPointerException when the parameter orderID is empty
	 * @throws IndexOutOfBoundsException if the orderID < 0 or greater the maximum of orderID.
	 */
	public Order getOrder(int orderID) throws NullPointerException, IndexOutOfBoundsException;
	
	/**
	 * Goes into the database and adds a new Actor row 
	 * based on the employee information being tossed in.
	 * @param Employee employee
	 * @throws NullPointerException when the parameter employee is empty
	 */
	public void insertEmployee(Employee employee) throws NullPointerException;
	
	/**
	 * Goes into the database and adds a new Order row 
	 * based on the Order information being tossed in.
	 * @param Order order
	 * @throws NullPointerException when the parameter order is empty
	 */
	public void insertOrder(Order order) throws NullPointerException;
	
	/**
	 * Clears all information in all tables, opens a file 
	 * based on the filePath and populates the database 
	 * with all information in the file.
	 * @param String filePath
	 * @throws NullPointerException when the parameter filePath is empty
	 */
	public void restoreBackUp(String filePath) throws NullPointerException;
	
	/**
	 * Goes into the database and updates a row based on 
	 * the Customer information being tossed in.
	 * @param Customer customer
	 * @throws NullPointerException when the parameter customer is empty
	 */
	public void updateCustomer(Customer customer) throws NullPointerException;
	
	/**
	 * Goes into the database and updates a row based on 
	 * the employee information being tossed in.
	 * @param Employee employee
	 * @throws NullPointerException when the parameter employee is empty
	 */
	public void updateEmployee(Employee employee) throws NullPointerException;
	
	/**
	 * Goes into the database and updates a row based on 
	 * the Order information being tossed in.
	 * @param Order order
	 * @throws NullPointerException when the parameter order is empty
	 */
	public void updateOrder(Order order) throws NullPointerException;
	
}
