package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Reemdo;
import com.revature.util.ConnectionFactory;

public class ReemdoDaoImpl implements ReemdoDao{
	
	//this class 
		@Override
		public List<Reemdo> getAllReemdos() {
			List<Reemdo> reemdos = new ArrayList<>();
			// Get our connection
			try (Connection conn = ConnectionFactory.getConnection()) {
				// Create our statement to communicate with the database
				Statement stmt = conn.createStatement();
				
				// Execute the statement, all matched records can be found in the ResultSet
				ResultSet rs = stmt.executeQuery("SELECT * FROM reemburs");
				
				// Populate our list of todos from the ResultSet
				while (rs.next()) {
					reemdos.add(new Reemdo(rs.getInt("reemId"), rs.getDouble("amount"), rs.getString("description"), rs.getString("status"), rs.getString("manager")));
				}
				
				// Return our Todos so that the application can further manipulate
				return reemdos;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public Reemdo getTodoById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Reemdo createTodo(Reemdo todo) {
			// Get a connection to our Data Source
			try (Connection conn = ConnectionFactory.getConnection()) {
				// Initialize our Insert statement
				PreparedStatement stmt = conn.prepareStatement("INSERT INTO todos (reemId, amount, description, status, manager) VALUES (?, ?, ?, ?, ?)");
				
				// Set the values of our Insert Statement to help prevent SQL Injection
				stmt.setInt(1, todo.getReemId());
				stmt.setDouble(2, todo.getAmount());
				stmt.setString(3, todo.getDescription());
				stmt.setString(4, todo.getStatus());
				stmt.setString(5, todo.getManager());
				
				// Execute the query, determining the number of rows that were affected
				int rowsAffected = stmt.executeUpdate();
				if (rowsAffected == 1)
					return todo;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return new Reemdo();
		}

		@Override
		public Reemdo updateTodo(Reemdo toBeUpdated) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long deleteTodo(Reemdo... toBeDeleted) {
			// TODO Auto-generated method stub
			return 0;
		}


}
