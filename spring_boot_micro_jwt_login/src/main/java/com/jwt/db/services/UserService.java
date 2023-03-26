package com.jwt.db.services;

import com.jwt.db.model.User;

public interface UserService {
	
	public User createUser(User user) throws Exception;
	
	public User getUser(String username);
	
	public void deleteUser(Long userId);

}
