package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Getting the form parameters from the client
		String username = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		
		//We need to do some error checking; we need to check that our strings aren't null
		//or empty strings
		
		if(username == null || username.equals("") || password1 == null || password1.equals("")
				|| password2 == null || password2.equals("")) {
			
			//Once again, setting the content type we want to send back to the client
			response.setContentType("text/plain");
			//Once again, creating a print writer object to write back to the client
			PrintWriter writing = response.getWriter();
			//Call the PrintWriter's write method
			writing.write("Yeah, right. You tried it. But nah.");
		}
		
		else if(!password1.equals(password2)){
			response.setContentType("text/html");
			PrintWriter writeMe = response.getWriter();
			writeMe.write("<table><thead><tr><td>You</td><td>Are</td></tr></thead><tbody>"
					+ "<tr><td>Very</td><td>Annoying</td></tr></tbody></table>");
		}
		else {
			System.out.println("Login redirect attempt!");

			response.sendRedirect("./employee.html");
			//response.sendRedirect("./Users/DispatcherServlet.html");

		}
		
		}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("LoginServlet doPost attempt!");

		doGet(request, response);
	}

}
