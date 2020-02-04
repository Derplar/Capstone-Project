/**
 * 
 */
package com.main.brokers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.main.bokerInterfaces.MenuBrokerInterface;
import com.main.databaseConnection.JDBCConnection;
import com.main.menu.Item;

/**
 * @author cuong
 *
 */
public class MenuBroker implements MenuBrokerInterface
{

	@Override
	public List<Item> getAllItem()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateItem(Item item) throws NullPointerException
	{
		JDBCConnection jdbcconnect = JDBCConnection.createConnection();
		Connection 	con = jdbcconnect.getConnection(); 
		String query = "UPDATE menu SET item = ?, description = ?, price = ?, "
					  + "cate = ?, image = ? WHERE itemID = ? ";
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(query);
			System.out.println("itemmmm0" + item.getItemId());
			ps.setString(1, item.getItemName());
			ps.setString(2, item.getDescription());
			ps.setDouble(3, item.getPrice());
			ps.setString(4, item.getCategory());
			ps.setString(5, item.getImagePath());
			ps.setInt(6, item.getItemId());
			int row = ps.executeUpdate();
			System.out.println("row number " +row);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			jdbcconnect.clearConnection(con);
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

	@Override
	public void deleteItem(Item item) throws NullPointerException
	{
		JDBCConnection jdbcconnect = JDBCConnection.createConnection();
		Connection 	con = jdbcconnect.getConnection(); 
		String query = "DELETE FROM menu WHERE itemID = ?";
		PreparedStatement ps =null;
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, item.getItemId());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally 
		{
			
			jdbcconnect.clearConnection(con);
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Item getItem(int itemId) throws NullPointerException
	{
		JDBCConnection jdbcconnect = JDBCConnection.createConnection();
		Connection 	con = jdbcconnect.getConnection(); 
		PreparedStatement ps = null;
		ResultSet rs = null;
		Item i = null;
		String query = "SELECT * FROM menu WHERE itemID = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, itemId);
			rs = ps.executeQuery();
			while(rs.next())
			{
				i = new Item(
						rs.getInt("itemID"),
						rs.getString("item")
						  ,rs.getString("description"), 
						  rs.getDouble("price"),
						  rs.getString("cate"),
						  rs.getString("image"));
			}
			return i;

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			jdbcconnect.clearConnection(con);
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
		
	}

	@Override
	public void insertItem(Item item) throws NullPointerException
	{
		JDBCConnection jdbcconnect = JDBCConnection.createConnection();
		Connection 	con = jdbcconnect.getConnection(); 
		PreparedStatement ps = null;
		
		String query = "INSERT INTO menu (item, description, price,cate, image) VALUES (?,?,?,?,?)";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1,item.getItemName()); 
			ps.setString(2,item.getDescription());
			ps.setDouble(3,item.getPrice());
			ps.setString(4, item.getCategory());
			ps.setString(5,item.getImagePath());
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 jdbcconnect.clearConnection(con);
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		
		
	}

	

}
