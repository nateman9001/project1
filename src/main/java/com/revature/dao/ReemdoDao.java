package com.revature.dao;

import java.util.List;

import com.revature.model.Reemdo;

public interface ReemdoDao {
	
	List<Reemdo> getAllReemdos();
	Reemdo getTodoById(int reemId);
	Reemdo createTodo(Reemdo todo);
	Reemdo updateTodo(Reemdo toBeUpdated);
	long deleteTodo(Reemdo... toBeDeleted);

}
