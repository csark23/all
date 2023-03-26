package com.example.db.service.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.db.models.User;
import com.example.db.models.UserRole;
import com.example.db.repo.RoleRepository;
import com.example.db.repo.UserRepository;
import com.example.db.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
		User local=this.userRepository.findByUserName(user.getUsername());
		if(local!=null) {
			System.out.println("User is already there!");
			throw new Exception("User already present!!");
		}else {
			//user create
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole())
			}
		}
		return null;
	}

}
