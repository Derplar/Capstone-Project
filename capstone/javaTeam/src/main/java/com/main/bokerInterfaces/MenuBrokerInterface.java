/**
 * 
 */
package com.main.bokerInterfaces;

import java.util.List;

import com.main.menu.Item;

/**
 * @author cuong
 * This class acts as the intermediary between the database and Menu actions.
 */
public interface MenuBrokerInterface
{
	/**
	 * Goes into the database and gets all Item rows,
	 * Then creates a list of Item objects based on the gotten rows and returns the List.
	 * @return List of all Item in menu 
	 */
	public List<Item> getAllItem();
	
	/**
	 * Goes into the database and updates a particular Item with the Item being tossed in used as a
	 * reference.
	 * @param item
	 * @throws NullPointerException
	 */
	public void updateItem(Item item) throws NullPointerException;
	
	/**
	 * Goes into the database and removes a particular Item with the Item being tossed in used as a
	 * reference.
	 * @param item
	 * @throws NullPointerException
	 */
	public void deleteItem(Item item) throws NullPointerException;

	/**
	 * Goes into the database and retrieves a row based on the itemID being tossed in.
	 * Then constructs a new Item object based on the row and returns it.
	 * @param itemId
	 * @return
	 * @throws NullPointerException
	 */
	public Item getItem(int itemId) throws NullPointerException;  
	
	/**
	 * Goes into the database and inserts a new row based on the Item being tossed in, using it as a
	 * reference.
	 * @param item
	 * @throws NullPointerException
	 */
	public void insertItem (Item item) throws NullPointerException;
}
