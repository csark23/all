package com.jwt.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.db.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	//Username, it will return the user of given username
	public User findByUsername(String username);
	
	
	
}
