/**
 * 
 */
package com.main.actor;

import java.sql.Date;
import java.util.List;

import com.main.menu.Item;
import com.main.menu.Order;



/**
 * @author cuong
 *
 */
public class Customer extends Actor
{
	



	private Order currentOrder;
	private List<Order> historyOrder;
	private List<Order> favoriteItemList;
	private String permanentNote;
	
	public Customer(int id, String role, String lastName, String firstName, String street, String houseNumber,
			String unitNumber, String city, String province, String postalCode, String country, String phoneNumber,
			String email, String password, int dateOfBirth, boolean state) {
		super(id, role, lastName, firstName, street, houseNumber, unitNumber, city, province, postalCode, country, phoneNumber,
				email, password, dateOfBirth, state);
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * 
	 * @param password
	 * @return
	 * @throws NullPointerException
	 */
	private boolean deleteAccount(String password) throws NullPointerException
	{
		
		return false;
		
	}
	
	/**
	 * 
	 * @return
	 */
	private boolean makeOrder()
	{
		return false;
		
	}
	
	/**
	 * 
	 * @param order
	 * @return
	 * @throws NullPointerException
	 */
	private boolean deleteOrder(Order order) throws NullPointerException
	{
		return false;
		
	}
	
	/**
	 * 
	 * @param order
	 * @return
	 * @throws NullPointerException
	 */
	private boolean updateHistoryList (Order order) throws NullPointerException
	{
		return false;
		
	}
	
	/**
	 * 
	 * @param item
	 * @return
	 * @throws NullPointerException
	 */
	private boolean addFavoriteItem (Item item) throws NullPointerException
	{
		return false;
		
	}
	
	/**
	 * 
	 * @param itemId
	 * @return
	 * @throws NullPointerException
	 */
	private boolean deleteFavoriteItem (int itemId)throws NullPointerException
	{
		return false;
		
	}
	
	/**
	 * 
	 * @param customerId
	 * @return
	 * @throws NullPointerException
	 */
	private List<Order> viewHistoryOrder (int customerId) throws NullPointerException
	{
		List<Order> historyOrderList = null;
		return historyOrderList;
		
	}
	
	
}
