package com.in28minutes.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven.course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StringBroker 
{
	public String getString()  {		
		ResultSet rs = null;
		PreparedStatement statement = null; 
		
        //JDBCConnection pool = JDBCConnection.getInstance();
        Connection connection = JDBCConnection.getConnection();
        String selectSQL = "SELECT * FROM test_table";
		
		String returnName = null;
		
		try 
		{			
			

            statement = connection.prepareStatement(selectSQL);
            rs = statement.executeQuery();

			if (rs.next()) {
				returnName = rs.getString("TEXT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
	                rs.close();
	                statement.close();
	    			connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			//pool.freeConnection(connection);
		}
		return returnName;
	}
}

