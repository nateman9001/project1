package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.model.UserDetails;
import com.revature.util.ConnectionFactory;

public class LoginDaoImpl implements LoginDao {

	/////////////////does nothing right now!!!!//////////////////
	
	
	@Override
	public UserDetails attemptAuthentication(String username, String password) {
		
		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stmt = conn.prepareCall("SELECT * FROM users WHERE username = ? AND password = ?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return new UserDetails(rs.getString("username"), rs.getString("role"));
			}
		} catch (SQLException e) {
			
		} 
		return null;
	}
	
}
