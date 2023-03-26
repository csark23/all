package com.springboot.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
