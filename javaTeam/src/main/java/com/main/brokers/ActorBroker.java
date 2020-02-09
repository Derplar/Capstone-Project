/**
 * Class Description: This class acts as the intermediary between the database and Actor actions
 */
package com.main.brokers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.main.bokerInterfaces.ActorBrokerInterface;
import com.main.databaseConnection.JDBCConnection;

/**
 * @author Cuong Nguyen, Chris Boot, Nguyen Khanh Duy Phan, Shawn Kaldenbach
 * @version 1.1
 */
public class ActorBroker implements ActorBrokerInterface {

	/**
	 * Goes into the database and verifies that 
	 * the current Actor exists in the database. 
	 * If they exist, return true. Otherwise return false.
	 * @param String email
	 * @param String password
	 * @return true if the credential exist
	 * 			no, otherwise.
	 * @throws NullPointerException if either email or password is empty
	 */
	@Override
	public boolean checkCredential(String email, String password) throws NullPointerException {
		JDBCConnection pool = JDBCConnection.createConnection();
		Connection con = pool.getConnection();
		String actorEmail = null;
		String actorPassword = null;

		boolean actorState = false;
		String query = "SELECT * FROM actor WHERE email_login = ?";
		
		PreparedStatement ps = null;
		ResultSet rs = null ; 
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, email);
			rs = ps.executeQuery();
			while(rs.next())
			{

				actorEmail = rs.getString("email_login");
				actorPassword = rs.getString("password");
				actorState = rs.getBoolean("active");
			}
			if(actorEmail == null)
			{
				return false;
			}
			else
			{
				if(actorPassword.equals(password) == true &&  actorState == true)
				{
					return true;
				}
				else 
				{
					return false;
				}
			}
			
			
		} catch (SQLException e) {
			System.out.println("no customer with that email");
			e.printStackTrace();
			return false;
			
		}finally
		{
			pool.clearConnection(con);
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

}
