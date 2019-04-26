package com.revature.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.TodoDao;
import com.revature.dao.TodoDaoImpl;
import com.revature.model.Employeedo;


public class TodoServiceImpl implements TodoService {

	private final TodoDao dao = new TodoDaoImpl();
	private final ObjectMapper mapper = new ObjectMapper();
	
	//this class 
	@Override
	public List<Employeedo> getAllTodos(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside TodoServiceImpl");
		return dao.getAllTodos();
	}

	@Override
	public Employeedo createTodo(HttpServletRequest request, HttpServletResponse response) {
		try {
			// From the HTTP Request body, parse the JSON into a Todo Object
			Employeedo todo = mapper.readValue(request.getInputStream(), Employeedo.class);
			System.out.println("Inside createTodo ServiceImpl");
			System.out.println(todo);
			return dao.createTodo(todo);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
