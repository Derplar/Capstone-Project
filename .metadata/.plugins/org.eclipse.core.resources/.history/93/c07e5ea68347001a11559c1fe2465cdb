package com.main.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
	private static JDBCConnection pool = null;
	private static final String URL = "jdbc:mysql://localhost/tandoorigrilldb";
	private static final String USER = "root";
	private static final String PASSWORD = "password";
	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static Connection con = null;
	/**
	 * 
	 */
	private JDBCConnection()
	{
		try {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @return
	 */
	public static synchronized JDBCConnection createConnection()
	{

			pool = new JDBCConnection();

		return pool;
	}
	/**
	 * 
	 * @return
	 */
	public static Connection getConnection()
	{
		return con;
	}
	/**
	 * 
	 * @param c
	 */
	public void clearConnection(Connection c)
	{
		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
