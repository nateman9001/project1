package com.revature.dao;

import com.revature.model.UserDetails;

public interface LoginDao {

	UserDetails attemptAuthentication(String username, String password);

}
