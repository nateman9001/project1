package com.revature.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.ReemdoDao;
import com.revature.dao.ReemdoDaoImpl;
import com.revature.model.Reemdo;

public class ReemdoServiceImpl implements ReemdoService{
	
	private final ReemdoDao dao = new ReemdoDaoImpl();
	private final ObjectMapper mapper = new ObjectMapper();
	
	//this class 
	@Override
	public List<Reemdo> getAllTodos(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside TodoServiceImpl");
		return dao.getAllReemdos();
	}

	@Override
	public Reemdo createTodo(HttpServletRequest request, HttpServletResponse response) {
		try {
			// From the HTTP Request body, parse the JSON into a Todo Object
			Reemdo todo = mapper.readValue(request.getInputStream(), Reemdo.class);
			return dao.createTodo(todo);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
