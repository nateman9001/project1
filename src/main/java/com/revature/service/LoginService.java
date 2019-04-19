package com.revature.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.UserDetails;

public interface LoginService {

	UserDetails attemptAuthentication(HttpServletRequest request, HttpServletResponse response);

}

