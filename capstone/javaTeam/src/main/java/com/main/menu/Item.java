/**
 * 
 */
package com.main.menu;

/**
 * @author cuong
 *
 */
public class Item
{
	private int itemId; 
	private String itemName; 
	private String description;
	private double price;
	private String category;
	private String imagePath;
	
	
	
	
	
	/**
	 *
	 * @param itemName
	 * @param description
	 * @param price
	 * @param category
	 * @param imagePath
	 */
	public Item( String itemName, String description, double price, String category, String imagePath) {
	
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.category = category;
		this.imagePath = imagePath;
	}
	
	public Item( int itemId ,String itemName, String description, double price, String category, String imagePath) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.category = category;
		this.imagePath = imagePath;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
	


	
	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}
	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	
	

}
