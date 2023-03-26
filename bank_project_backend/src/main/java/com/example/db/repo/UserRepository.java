package com.example.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUserName(String username);
	
}
