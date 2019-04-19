package com.revature.connection;
/*
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.dao.LoginDao;
import com.revature.dao.LoginDaoImpl;
import com.revature.dao.TodoDao;
import com.revature.dao.TodoDaoImpl;
import com.revature.model.Employeedo;
import com.revature.model.UserDetails;
import com.revature.util.ConnectionFactory;

public class DaoTest {

	private final TodoDao todoDao = new TodoDaoImpl();
	private final LoginDao loginDao = new LoginDaoImpl();
	
	@BeforeClass
	public static void setUpConnectionFactory() {
		ConnectionFactory.getConnection();
	}
	
	@Test
	public void todoDao_ShouldPullCorrectNumberOfTodos() {
		assertEquals(7, todoDao.getAllTodos().size());
		assertEquals(2, todoDao.getAllTodosByUsername("manager").size());
		assertEquals(5, todoDao.getAllTodosByUsername("william").size());
	}
	
	@Test
	public void todoDao_ShouldCreateTodosProperly() {
		final Todo toBeCreated = new Todo();
		toBeCreated.setTitle("Another title");
		toBeCreated.setDescription("Another description");
		assertNotNull(todoDao.createTodo(toBeCreated, "username"));
		
		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stmt = conn.prepareCall("DELETE FROM todos WHERE title = ?");
			stmt.setString(1, "Another title");
			assertEquals(1, stmt.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void loginDao_ShouldProduceCorrectUserDetails_ForValidCredentials() {
		final UserDetails employee = loginDao.attemptAuthentication("william", "Password123!");
		assertNotNull(employee);
		assertEquals("william", employee.getUsername());
		assertEquals("employee", employee.getRole());
		
		final UserDetails manager = loginDao.attemptAuthentication("manager", "Password123!");
		assertNotNull(manager);
		assertEquals("manager", manager.getUsername());
		assertEquals("manager", manager.getRole());
	}
	
	@Test
	public void loginDao_ShouldProduceNull_ForInvalidCredentials() {
		final UserDetails shouldBeNull = loginDao.attemptAuthentication("invalid", "invalid");
		assertNull(shouldBeNull);
	}
}
	*/

