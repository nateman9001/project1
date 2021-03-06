package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Employeedo;
import com.revature.util.ConnectionFactory;

public class TodoDaoImpl implements TodoDao {

	//this class 
	@Override
	public List<Employeedo> getAllTodos() {
		List<Employeedo> todos = new ArrayList<>();
		// Get our connection
		try (Connection conn = ConnectionFactory.getConnection()) {
			// Create our statement to communicate with the database
			Statement stmt = conn.createStatement();
			
			// Execute the statement, all matched records can be found in the ResultSet
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
			
			// Populate our list of todos from the ResultSet
			while (rs.next()) {
				todos.add(new Employeedo(rs.getInt("userId"), rs.getString("name"), rs.getString("password"), rs.getString("email"), rs.getString("department"), rs.getString("employeeType")));
			}
			
			// Return our Todos so that the application can further manipulate
			return todos;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	/////////////////////////////////////////////////
	@Override
	public Employeedo getTodoById(int id) {
	
		return null;
	}

	///////////////////////////////////////////////////
	@Override
	public Employeedo createTodo(Employeedo todo) {
		
		for (int i = 0; i< getAllTodos().size(); i++)
		{
			if (getAllTodos().get(i) == todo)
			{
				System.out.println("Theres too many of them");
				return null;
			}
		}
		
		// Get a connection to our Data Source
		try (Connection conn = ConnectionFactory.getConnection()) {
			//
			//ok, its getting this far
			//
			System.out.println("Inside TodoDaoImpl createTodo, value is " + todo);
			// Initialize our Insert statement
			CallableStatement stmt = conn.prepareCall("CALL create_employee(?, ?, ?, ?, ?)");
			
			// Set the values of our Insert Statement to help prevent SQL Injection
			
			stmt.setString(1, todo.getName());
			stmt.setString(2, todo.getPassword());
			stmt.setString(3, todo.getEmail());
			stmt.setString(4, todo.getDepartment());
			stmt.setString(5, todo.getEmployeeType());
			
			// Execute the query, determining the number of rows that were affected
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1)
				System.out.println("Inside TodoDaoImpl creatTodo, right before return, value is " + todo);

				
			PreparedStatement prep = conn.prepareStatement("select * from employee where name = ?");
			prep.setString(1, todo.getName());
			ResultSet rs = prep.executeQuery();
			if (rs.next())
				return new Employeedo(rs.getInt("userId"), rs.getString("name"), rs.getString("email"), rs.getString("department"), rs.getString("employeeType"));
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Employeedo();
	}

	/////////////////////////////////////////////////////////////////////////
	@Override
	public Employeedo updateTodo(Employeedo toBeUpdated) {
		// TODO Auto-generated method stub
		return null;
	}

	////////////////////////////////////////////////////////////////////////
	@Override
	public long deleteTodo(Employeedo... toBeDeleted) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
