package com.revature.web;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.ReemdoService;
import com.revature.service.ReemdoServiceImpl;
import com.revature.service.TodoService;
import com.revature.service.TodoServiceImpl;

public class ReemDispatcher {
	
	private static final ReemdoService reemdoService = new ReemdoServiceImpl();

	// Restrict Instantiation
	private ReemDispatcher() {}
	
	public static Object process(HttpServletRequest request, HttpServletResponse response) {
		final String uri = request.getRequestURI().replace("/ServletExample/api", "");
		System.out.println("Inside process Dispatcher: " + request.getMethod() + " request going to " + uri);
		switch(uri) {
		case "/reemdos":
			return reemdoService.getAllTodos(request, response);
		default:
			return Collections.singletonMap("message", "Not yet implemented ReemDispatcher");
		}
	}
	
	
	
	
	
	
	public static Object processPost(HttpServletRequest request, HttpServletResponse response) {
		final String uri = request.getRequestURI().replace("/ServletExample/api", "");
		System.out.println("Inside processPost Dispatcher: " + request.getMethod() + " request going to " + uri);
		switch(uri) {
		case "/todos":
			return reemdoService.createTodo(request, response);
		default:
			return Collections.singletonMap("message", "Not yet implemented");
		}
	}
}
