/**
 * 
 */
package com.main.brokers;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.main.actor.Customer;
import com.main.bokerInterfaces.CustomerBrokerInterface;
import com.main.menu.Item;
import com.main.menu.Order;
import com.main.databaseConnection.*;




/**
 * @author cuong
 *
 */
public class CustomerBroker implements CustomerBrokerInterface
{
	private final String role = "C";

	@Override
	public List<Order> getAllOrder(int customerId) throws NullPointerException
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerInfo(int customerId) throws NullPointerException
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getFavoriteItems(int customerId) throws NullPointerException
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertFavoriteItems(int customerId, Item item) throws NullPointerException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFavoriteItem(int customerId, Item item) throws NullPointerException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomerInfo(Customer cus) throws NullPointerException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertCustomer(Customer cus) throws NullPointerException
	{
		JDBCConnection jdbcconnect = JDBCConnection.createConnection();
		Connection 	con = jdbcconnect.getConnection(); 
		PreparedStatement ps = null;
		
		 try 
		 {
			 String query = "INSERT INTO actor (actorID,email_login, password, f_name, "
			 		+ 	 	"l_name, house_number, unit_number, postal_code, city,"
			 		+ 		" province, country, role, active) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			 
			 ps = con.prepareStatement(query);
			 ps.setInt(1, 0);
			 ps.setString(2, cus.getEmail());
			 ps.setString(3, cus.getPassword());
			 ps.setString(4, cus.getFirstName());
			 ps.setString(5, cus.getLastName());
			 ps.setString(6, cus.getHouseNumber());
			 ps.setString(7, cus.getUnitNumber());
			 ps.setString(8, cus.getPostalCode());
			 ps.setString(9, cus.getCity());
			 ps.setString(10, cus.getProvince());
			 ps.setString(11, cus.getCountry());
			 ps.setString(12, role);
			 ps.setInt(13, 1);
			 int rows = ps.executeUpdate();
		 } catch (SQLException e) 
		{
			System.out.println("can't insert");
			e.printStackTrace();
		}
		 finally {
			 try {
				 jdbcconnect.clearConnection(con);
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 }
			
		
		
	}

	@Override
	public void deleteCustomer(Customer cus) throws NullPointerException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertOrder(Order order) throws NullPointerException
	{
		// TODO Auto-generated method stub
		
	}

}
