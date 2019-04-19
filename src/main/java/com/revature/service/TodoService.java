package com.revature.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Employeedo;


public interface TodoService {

	List<Employeedo> getAllTodos(HttpServletRequest request, HttpServletResponse response);
	Employeedo createTodo(HttpServletRequest request, HttpServletResponse response);
}
