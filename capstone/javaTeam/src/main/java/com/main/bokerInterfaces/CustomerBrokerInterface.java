/**

 * 
 */
package com.main.bokerInterfaces;

import java.util.List;


import com.main.actor.Customer;
import com.main.menu.Item;
import com.main.menu.Order;


/**
 * @author cuong
 * This class acts as the intermediary between the database and Customer actions.
 */
public interface CustomerBrokerInterface 
{
	/**
	 * Goes into the database and gets all completed orders that have this customersID.
	 * Then, create a List of Order objects of those completed orders and return them.
	 * 
	 * @param customerId
	 * @return
	 * @throws NullPointerException
	 */
	public List<Order> getAllOrder(int customerId) throws NullPointerException;
	
	/**
	 * Goes into the database and gets all info about a customer using its ID.
	 * Create a new Customer object with this information and return it.
	 * 
	 * @param customerId
	 * @return
	 * @throws NullPointerException
	 */
	public Customer getCustomerInfo(int customerId) throws NullPointerException; 
	
	/**
	 * goes into the database and gets all the favorite Items based on the customerID being put in
	 * Then, construct new Item objects with this information and return it.
	 * 
	 * 
	 * @param customerId
	 * @return
	 * @throws NullPointerException
	 */
	public List<Item> getFavoriteItems (int customerId) throws NullPointerException; 
	
	/**
	 * Goes into the database and creates a new favorite Item for a customer by taking the customerID
	 * and itemID and
     * Inserting it into the favorites table
	 * @param customerId
	 * @param item
	 * @throws NullPointerException
	 */
	public void insertFavoriteItems(int customerId, Item item) throws NullPointerException;
	
	/**
	 *Goes into the database and removes a favorite Item from a customer by taking the customerID
	 * and itemID and removing it from the favorites table 
 	 *
	 * @param customerId
	 * @param item
	 * @throws NullPointerException
	 */
	public void removeFavoriteItem(int customerId, Item item) throws NullPointerException; 
	
	/**
	 * Goes into the database and updates a Customer's account information with the parameter
	 * Customer being put in.
	 * @param cus
	 * @throws NullPointerException
	 */
	public void updateCustomerInfo(Customer cus) throws NullPointerException; 
	
	/**
	 * Goes into the database and creates a new Customer row in the database based on the Customer
	 * being put in.
	 * @param cus customer
	 * @throws NullPointerException
	 */
	public void insertCustomer(Customer cus) throws NullPointerException; 
	
	/**
	 * Goes into the database and removes all information in the database based on the Customer being
	 * put in.
	 * @param cus
	 * @throws NullPointerException
	 */
	public void deleteCustomer (Customer cus) throws NullPointerException;
	
	/**
	 * Goes into the database and adds the Order into the database based on the Order info being put
	 * in.
	 * @param order 
	 * @throws NullPointerException
	 */
	public void insertOrder (Order order) throws NullPointerException;
	
}
