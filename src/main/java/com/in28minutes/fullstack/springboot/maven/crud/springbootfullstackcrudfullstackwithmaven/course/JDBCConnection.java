package com.in28minutes.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	//static reference to itself, because I'm too lazy for proper singleton
	private static JDBCConnection instance = new JDBCConnection();
	public static final String URL = "jdbc:mysql://localhost/javatestdb";
	public static final String USER = "user";
	public static final String PASSWORD = "password";
	public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver"; 
	
	//private constructor
	private JDBCConnection() {
		try {
			//Step 2: Load MySQL Java driver
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection createConnection() {

		Connection connection = null;
		try {
			//Step 3: Establish Java MySQL connection
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("ERROR: Unable to Connect to Database.");
		}
		return connection;
	}	
	
	public static Connection getConnection() {
		return instance.createConnection();
	}
}

/*
import java.sql.*;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class JDBCConnection {
	
    private static JDBCConnection pool = null;
    private static DataSource dataSource = null;
    
    private JDBCConnection() {
        try{
            InitialContext ic = new InitialContext();
            System.out.println("About to lookup");
            dataSource = (DataSource) ic.lookup("jdbc:mysql://localhost/javatestdb");
            System.out.println("Looked up.");
        } catch (NamingException e) {
            System.out.println(e);
        }

    }

    public static synchronized JDBCConnection getInstance() {
        if(pool == null) {
            pool = new JDBCConnection();
        }
        return pool;
    }

    public Connection getConnection() {
        try{
            return dataSource.getConnection();
           
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void freeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
}
*/
