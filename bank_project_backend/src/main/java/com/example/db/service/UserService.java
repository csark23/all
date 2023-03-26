package com.example.db.service;

import java.util.Set;

import com.example.db.models.User;
import com.example.db.models.UserRole;

public interface UserService {
	//creating user
	public User createUser(User user,Set<UserRole> userRoles) throws Exception;
	
}
