package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.UserDetails;
import com.revature.service.LoginService;
import com.revature.service.LoginServiceImpl;

public class LoginServlet2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private final LoginService service = new LoginServiceImpl();

	/////////this does nothign right now!!!!!////////////////////
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final UserDetails user = service.attemptAuthentication(req, resp);
		if (user != null) {
			req.getSession().setAttribute("currentUser", user.getUsername());
			req.getSession().setAttribute("role", user.getRole());
			req.getRequestDispatcher("/authenticated.jsp").forward(req, resp);
		} else {
			resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}
	}
	
}