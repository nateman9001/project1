package com.revature.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.LoginDao;
import com.revature.dao.LoginDaoImpl;
import com.revature.model.UserDetails;

public class LoginServiceImpl implements LoginService {
	
	private final LoginDao dao = new LoginDaoImpl();
	
	@Override
	public UserDetails attemptAuthentication(HttpServletRequest request, HttpServletResponse response) {
		final String username = request.getParameter("username");
		final String password = request.getParameter("password");
		if (username == null || password == null)
			return null;
		
		return dao.attemptAuthentication(username, password);
	}

	
}
