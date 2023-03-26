package com.example.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
}
