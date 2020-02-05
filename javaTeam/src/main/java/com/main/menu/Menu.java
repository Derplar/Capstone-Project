/**
 * 
 */
package com.main.menu;

import java.awt.Image;
import java.util.List;

/**
 * @author cuong
 * This class constructs a Menu based on all the current Items.
 */
public class Menu
{
	private List<Item> itemList;
	
	/**
	 * Adds a new Item to the Menu and saves it to the database
	 * Takes in an Item, sends it to the MenuBroker and if successful, adds that item to the itemList.
	 * @param item
	 * @throws NullPointerException
	 */
	public void addToItemList(Item item) throws NullPointerException
	{
		
	}
	
	/**
	 * Modifies a live Item from the Menu object and saves all changes to all sources.
	 * Takes in an Item, finds its itemID in the list, then sends the item to the MenuBroker.
	 * If that is successful update switch the Item with the parameter Item.
	 * @param itemId
	 * @param itemName
	 * @param price
	 * @param description
	 * @param category
	 * @param image
	 * @throws NullPointerException
	 */
	public void modifyItemFromList(int itemId, String itemName, double price, 
								 String description, String category, Image image) throws NullPointerException 
	{
		
	}
	
	/**
	 * Removes a particular Item from the Menu object and saves all changes to all sources.
	 * Takes in an Item, finds its itemID in the list, then sends the item to the MenuBroker.
	 * If that is successful remove that Item from the itemList.
	 * @param ItemId
	 * @return
	 * @throws NullPointerException
	 */
	public boolean deleteItemFromList (int ItemId) throws NullPointerException
	{
		return false;
		
	}
	
	/**
	 * Parses through the itemList, and if the items name contains the parameter name,
	 * it adds it to a temporary Item list, then returns that List of Items.
	 * @param name
	 * @return
	 * @throws NullPointerException
	 */
	public List<Item> displayItemList (String name) throws NullPointerException
	{
		return null;
		
	}
	
	/**
	 * Takes the parameter itemID and goes through the itemList, and gets all items that are
	 * the parameter category. Then, returns the List.
	 * @param category
	 * @return
	 * @throws NullPointerException
	 */
	public List<Item> displayCategory(String category) throws NullPointerException
	{
		return null;
		
	}
	/**
	 * Gets the itemList and returns all current Items in it.
	 * @return
	 * @throws NullPointerException
	 */
	public List<Item> displayAllItem() throws NullPointerException
	{
		return null;
		
	}
	
	
	/**
	 * Goes through the itemList and, when it finds the itemID that matches the parameter, returns it.
	 * @param itemId
	 * @return
	 * @throws NullPointerException
	 */
	public Item getItem(int itemId) throws NullPointerException
	{
		return null;
		
	}
	
}
