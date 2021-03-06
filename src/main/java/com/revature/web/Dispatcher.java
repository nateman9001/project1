package com.revature.web;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.TodoService;
import com.revature.service.TodoServiceImpl;

public class Dispatcher {
	
	private static final TodoService todoService = new TodoServiceImpl();

	// Restrict Instantiation
	private Dispatcher() {}
	
	public static Object process(HttpServletRequest request, HttpServletResponse response) {
		final String uri = request.getRequestURI().replace("/ServletExample/api", "");
		System.out.println("Inside process Dispatcher: " + request.getMethod() + " request going to " + uri);
		switch(uri) {
		case "/todos":
			return todoService.getAllTodos(request, response);
		default:
			return Collections.singletonMap("message", "Not yet implemented Dispatcher");
		}
	}
	
	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static Object processPost(HttpServletRequest request, HttpServletResponse response) {
		final String uri = request.getRequestURI().replace("/ServletExample/api", "");
		System.out.println("Inside processPost Dispatcher: " + request.getMethod() + " request going to " + uri);
		switch(uri) {
		case "/todos":
			return todoService.createTodo(request, response);
		default:
			return Collections.singletonMap("message", "Not yet implemented");
		}
	}
}
