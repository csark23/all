package com.jwt.db.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.db.exception.UserFoundException;
import com.jwt.db.model.User;
import com.jwt.db.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) throws Exception {
		User local = this.userRepository.findByUsername(user.getUsername());
		if(local!= null) {
			System.out.println("User is already taken !!");
			throw new UserFoundException();
		}
		else {
			local = this.userRepository.save(user);
		}
		return local;
	}

	@Override
	public User getUser(String username) {
		return this.userRepository.findByUsername(username);	
	}

	@Override
	public void deleteUser(Long userId) {
		
		this.userRepository.deleteById(userId);
	}

}
