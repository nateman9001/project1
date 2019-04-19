package com.revature.dao;

import java.util.List;

import com.revature.model.Employeedo;

public interface TodoDao {

	List<Employeedo> getAllTodos();
	Employeedo getTodoById(int userId);
	Employeedo createTodo(Employeedo todo);
	Employeedo updateTodo(Employeedo toBeUpdated);
	long deleteTodo(Employeedo... toBeDeleted);
}
