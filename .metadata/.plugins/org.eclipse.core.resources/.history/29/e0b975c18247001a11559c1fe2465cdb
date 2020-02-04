/**
 * 
 */
package com.main.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.brokers.MenuBroker;
import com.main.menu.Item;

/**
 * @author cuong
 *
 */
@RestController
@RequestMapping("/menurest")
public class MenuRestControl {
		
	@PostMapping("/additem/{itemname}/{des}/{price}/{cate}/{path}")
	public String addToItemList(@PathVariable("itemname")String itemName, 
							  @PathVariable("des")String description, 
							  @PathVariable("price")double price, 
							  @PathVariable("cate")String category, 
							  @PathVariable("path")String imagePath)
	{
		Item item = new Item(itemName,description, price,category, imagePath);
		MenuBroker mb = new MenuBroker();
		mb.insertItem(item);
		return item.getCategory();
		
	}
	
	@PostMapping("/edititem/{itemID}/{itemname}/{des}/{price}/{cate}/{path}")
	public String modifyItemFromList(@PathVariable("itemID") int itemID,
								   @PathVariable("itemname")String itemName, 
			  					   @PathVariable("des")String description, 
			  					   @PathVariable("price")double price, 
			  					   @PathVariable("cate")String category, 
			  					   @PathVariable("path")String imagePath)
	{
		MenuBroker mb = new MenuBroker();
		Item editedItem = mb.getItem(itemID);
		System.out.print(editedItem.getItemName());
		editedItem.setItemName(itemName);
		editedItem.setDescription(description);
		editedItem.setPrice(price);
		editedItem.setCategory(category);
		editedItem.setImagePath(imagePath);
		mb.updateItem(editedItem);
		System.out.print(mb.getItem(itemID).getItemName());
		return "Item edited";
	}
	
	@PostMapping("/getitem/{itemID}")
	public Item getItem(@PathVariable("itemID") int itemID)
	{
		MenuBroker mb = new MenuBroker();
		return mb.getItem(itemID);
		
	}
	@PostMapping("/deleteitem/{itemID}")
	public String deleteItemFromList(@PathVariable("itemID") int itemID)
	{
		MenuBroker mb = new MenuBroker();
		Item deletedItem = mb.getItem(itemID);
		
		mb.deleteItem(deletedItem);
		
		return "Item is deleted";
	}
	
	
	
}
