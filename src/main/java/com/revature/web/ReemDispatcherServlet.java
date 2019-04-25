package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.util.ConnectionFactory;

public class ReemDispatcherServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final ObjectMapper mapper = new ObjectMapper();
	
	//this class is like a middle-man between the connection factory and the 
	//Dao getting info 
	public ReemDispatcherServlet() {
		ConnectionFactory.getConnection();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Entering ReemDispatcherServlet");
		resp.setContentType("application/json");
		
		// getOutputStream() because it will write the response more efficiently than getWriter().println()
		// mapper.writeValueAsBytes() converts whatever the Dispatcher returns into a byte[], which getOutputStream().write() accepts
		// Dispatcher.process() returns whatever resource we have available at the HttpServletRequest's URI
		System.out.println("Processing");
		resp.getOutputStream().write(mapper.writeValueAsBytes(ReemDispatcher.process(req, resp)));
		System.out.println("Response sent successfullyR1!");
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Entering DispatcherServlet.doPost");
		resp.setContentType("application/json");
		
		resp.getOutputStream().write(mapper.writeValueAsBytes(Dispatcher.processPost(req, resp)));
		System.out.println("Response sent successfullyR2!");
	}
}
