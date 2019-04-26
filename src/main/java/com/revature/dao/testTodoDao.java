package com.revature.dao;

import java.util.List;

import com.revature.model.Employeedo;

public interface testTodoDao {

	List<Employeedo> getAllTodosByUsername(String username);
	Employeedo createTodo(Employeedo todo, String username);
	
}
