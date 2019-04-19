package com.revature.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Reemdo;

public interface ReemdoService {
	List<Reemdo> getAllTodos(HttpServletRequest request, HttpServletResponse response);
	Reemdo createTodo(HttpServletRequest request, HttpServletResponse response);

}
