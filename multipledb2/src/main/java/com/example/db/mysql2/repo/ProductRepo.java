package com.example.db.mysql2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db.mysql2.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
	Product findByTitle(String title);
	
}
