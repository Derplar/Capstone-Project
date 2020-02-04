/**
 * Class Description: This class acts as the intermediary
 * between the database and Administrator actions
 */
package com.main.brokers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.main.actor.Customer;
import com.main.actor.Employee;
import com.main.bokerInterfaces.AdminBrokerInterface;
import com.main.databaseConnection.JDBCConnection;
import com.main.menu.Order;
import com.mysql.cj.xdevapi.Result;




/**
 * @author Cuong Nguyen, Chris Boot, Nguyen Khanh Duy Phan, Shawn Kaldenbach
 * @version 1.1
 */
public class AdminBroker implements AdminBrokerInterface {

	/**
	 * Gets all information in all tables, creates a new file, 
	 * saves all information to the file Then saves it to the filePath.
	 * @param String filePath
	 * @throw NullPointerException when the parameter filePath is empty.
	 */
	@Override
	public void createBackUp(String filePath) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Goes into the database and removes a row based on
	 * the customer information being tossed in.
	 * @param Customer customer
	 * @throws NullPointerException when the parameter customer is empty
	 */
	@Override
	public void deleteCustomer(Customer customer) throws NullPointerException {
		JDBCConnection pool = JDBCConnection.createConnection();
		Connection con = pool.getConnection();
		String query = "DELETE FROM actor WHERE actorID = ?";
		PreparedStatement ps = null;
		int row; 
			
			try {
				ps = con.prepareStatement(query);
				ps.setInt(1, customer.getId());
				row = ps.executeUpdate();
				
			} catch (SQLException e) {
				System.out.println("can't delete customer");
				e.printStackTrace();
			}finally
			{
				pool.clearConnection(con);
			}
		
	}

	/**
	 * Goes into the database and removes a row based 
	 * on the employee information being tossed in.
	 * @param Employee employee
	 * @throws NullPointerException when the parameter employee is empty
	 */
	@Override
	public void deleteEmployee(Employee employee) throws NullPointerException {
		JDBCConnection pool = JDBCConnection.createConnection();
		Connection con = pool.getConnection();
		String query = "DELETE FROM actor WHERE actorID = ?";
		PreparedStatement ps = null;
		int row;
			
			try {
				ps = con.prepareStatement(query);
				ps.setInt(1, employee.getId());
				row = ps.executeUpdate();
				
			} catch (SQLException e) {
				System.out.println("can't delete employee");
				e.printStackTrace();
			}finally
			{
				pool.clearConnection(con);
			}
	}

	/**
	 * Goes into the database and removes a row based 
	 * on the order information being tossed in.
	 * @param Order order
	 * @throws NullPointerException when the parameter order is empty
	 */
	@Override
	public void deleteOrder(Order order) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Goes into the database and gets all rows in 
	 * the Orders table, constructs new Order objects 
	 * and returns that list of Orders.
	 * @return List<?>
	 */
	@Override
	public List<?> getAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Goes into the database and gets the row from 
	 * the Actor table with the customerID, constructs
	 * a new Customer object and returns it.
	 * @param int customerID
	 * @return Customer
	 * @throws NullPointerException when the parameter customerID is empty
	 * @throws IndexOutOfBoundsException if the customerID < 0 or greater the maximum of customerIDs
	 */
	@Override
	public Customer getCustomer(int customerID) throws NullPointerException, IndexOutOfBoundsException {
		JDBCConnection pool = JDBCConnection.createConnection();
		Connection con = pool.getConnection();
		String query = "SELECT * FROM actor WHERE actorID = ?";
		PreparedStatement ps = null;
		ResultSet rs = null ; 
			Customer cus = null;
			
			try {
				ps = con.prepareStatement(query);
				ps.setInt(1, customerID);
				rs = ps.executeQuery();
				
				while(rs.next())
				{
				 cus = new Customer(customerID, rs.getString("role"), rs.getString("l_name"), 
						 rs.getString("f_name"), "dddd", rs.getString("house_number"), rs.getString("unit_number"), 
						 rs.getString("city"), rs.getString("province"), rs.getString("postal_code"), 
						 rs.getString("country"), "587-333-2333", rs.getString("email_login"), rs.getString("password"),  0, true);
				}
				return cus;
				
			} catch (SQLException e) {
				System.out.println("can't get Customer");
				e.printStackTrace();
			}finally
			{
				pool.clearConnection(con);
			}
				
		
		return cus;
	}

	/**
	 * Goes into the database and gets the row from 
	 * the Actor table with the employeeID, constructs 
	 * a new employee object and returns it.
	 * @param int employeeID
	 * @return Employee
	 * @throws NullPointerException when the parameter employeeID is empty
	 * @throws IndexOutOfBoundsException if the employeeIDs < 0 or greater the maximum of employeeID.
	 */
	@Override
	public Employee getEmployee(int employeeID) throws NullPointerException, IndexOutOfBoundsException {
		JDBCConnection pool = JDBCConnection.createConnection();
		Connection con = pool.getConnection();
		String query = "SELECT * FROM actor WHERE actorID = ?";
		PreparedStatement ps = null;
		ResultSet rs = null ; 
			Employee emp = null;
			
			try {
				ps = con.prepareStatement(query);
				ps.setInt(1, employeeID);
				rs = ps.executeQuery();
				
				while(rs.next())
				{
				 emp = new Employee(employeeID, rs.getString("role"), rs.getString("l_name"), 
						 rs.getString("f_name"), "dddd", rs.getString("house_number"), rs.getString("unit_number"), 
						 rs.getString("city"), rs.getString("province"), rs.getString("postal_code"), 
						 rs.getString("country"), "587-333-2333", rs.getString("email_login"), rs.getString("password"),  0, true);
				}
				return emp;
				
			} catch (SQLException e) {
				System.out.println("can't get employee");
				e.printStackTrace();
			}finally
			{
				pool.clearConnection(con);
			}
				
		
		return emp;
	}

	/**
	 * Goes into the database and gets the row from 
	 * the Order table with the orderID, constructs 
	 * a new Order object and returns it.
	 * @param int orderID
	 * @return Order 
	 * @throws NullPointerException when the parameter orderID is empty
	 * @throws IndexOutOfBoundsException if the orderID < 0 or greater the maximum of orderID.
	 */
	@Override
	public Order getOrder(int orderID) throws NullPointerException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Goes into the database and adds a new Actor row 
	 * based on the employee information being tossed in.
	 * @param Employee employee
	 * @throws NullPointerException when the parameter employee is empty
	 */
	@Override
	public void insertEmployee(Employee employee) throws NullPointerException {
		JDBCConnection pool = JDBCConnection.createConnection(); 
		Connection con = pool.getConnection();
		PreparedStatement ps = null;
		String query = "INSERT INTO actor "
				+ "(actorID, email_login, password, f_name, l_name, house_number," //6
				+ "unit_number, postal_code, city, province, country, role, active) "//7 //=13
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		ResultSet rs = null;
		try 
		{
			ps = con.prepareStatement(query);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getPassword());
			ps.setString(4, employee.getFirstName());
			ps.setString(5, employee.getLastName());
			ps.setString(6, employee.getHouseNumber());
			ps.setString(7, employee.getUnitNumber());
			ps.setString(8, employee.getPostalCode());
			ps.setString(9, employee.getCity());
			ps.setString(10, employee.getProvince());
			ps.setString(11, employee.getCountry());
			ps.setString(12, employee.getRole());
			ps.setByte(13, (byte) 1); //https://www.programcreek.com/java-api-examples/?class=java.sql.PreparedStatement&method=setByte 
			//https://stackoverflow.com/questions/38420270/changing-tinyint1-datatype-in-a-mysql-database-using-java
			rs = ps.executeQuery();
		} catch (SQLException e) {
			System.out.println("can't insert");
			e.printStackTrace();
		} finally 
		{	try {
			pool.clearConnection(con);
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		
	}

	/**
	 * Goes into the database and adds a new Order row 
	 * based on the Order information being tossed in.
	 * @param Order order
	 * @throws NullPointerException when the parameter order is empty
	 */
	@Override
	public void insertOrder(Order order) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Clears all information in all tables, opens a file 
	 * based on the filePath and populates the database 
	 * with all information in the file.
	 * @param String filePath
	 * @throws NullPointerException when the parameter filePath is empty
	 */
	@Override
	public void restoreBackUp(String filePath) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Goes into the database and updates a row based on 
	 * the Customer information being tossed in.
	 * @param Customer customer
	 * @throws NullPointerException when the parameter customer is empty
	 */
	@Override
	public void updateCustomer(Customer customer) throws NullPointerException {
		JDBCConnection pool = JDBCConnection.createConnection(); 
		Connection con = pool.getConnection();
		PreparedStatement ps = null;
		String query = "UPDATE actor SET email_login = ?,"
						+ "password = ?, f_name = ?, l_name = ?,"
						+ "house_number = ?, unit_number = ?, postal_code = ?,"
						+ "city = ?, province = ?, country = ?, role = ?"
						+ "WHERE actorID = ?";
		/////////////////////////IS CUSTOMER ACTIVE OR NOT?/////////////////////////
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, customer.getEmail());
			ps.setString(2, customer.getPassword());
			ps.setString(3, customer.getFirstName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getHouseNumber());
			ps.setString(6, customer.getUnitNumber());
			ps.setString(7, customer.getPostalCode()); 
			ps.setString(8, customer.getCity());
			ps.setString(9, customer.getProvince()); 
			ps.setString(10, customer.getCountry()); 
			ps.setString(11, customer.getRole());
			ps.setInt(13, customer.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("can't update customer");
			e.printStackTrace();
		} finally 
		{	try {
			pool.clearConnection(con);
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		
	}

	/**
	 * Goes into the database and updates a row based on 
	 * the employee information being tossed in.
	 * @param Employee employee
	 * @throws NullPointerException when the parameter employee is empty
	 */
	@Override
	public void updateEmployee(Employee employee) throws NullPointerException {
		JDBCConnection pool = JDBCConnection.createConnection(); 
		Connection con = pool.getConnection();
		PreparedStatement ps = null;
		String query = "UPDATE actor SET email_login = ?,"
						+ "password = ?, f_name = ?, l_name = ?,"
						+ "house_number = ?, unit_number = ?, postal_code = ?,"
						+ "city = ?, province = ?, country = ?, role = ?"
						+ "WHERE actorID = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, employee.getEmail());
			ps.setString(2, employee.getPassword());
			ps.setString(3, employee.getFirstName());
			ps.setString(4, employee.getLastName());
			ps.setString(5, employee.getHouseNumber());
			ps.setString(6, employee.getUnitNumber());
			ps.setString(7, employee.getPostalCode()); 
			ps.setString(8, employee.getCity());
			ps.setString(9, employee.getProvince()); 
			ps.setString(10, employee.getCountry()); 
			ps.setString(11, employee.getRole()); 
			ps.setInt(12, employee.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("can't update employee");
			e.printStackTrace();
		} finally 
		{	try {
			pool.clearConnection(con);
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		
		
	}

	/**
	 * Goes into the database and updates a row based on 
	 * the Order information being tossed in.
	 * @param Order order
	 * @throws NullPointerException when the parameter order is empty
	 */
	@Override
	public void updateOrder(Order order) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	

}
