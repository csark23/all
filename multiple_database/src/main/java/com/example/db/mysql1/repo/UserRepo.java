package com.example.db.mysql1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db.mysql1.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
}
