package com.jwt.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.db.model.User;
import com.jwt.db.model.UserRepo;

@RestController
public class RegistrationController {
	
	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping("/check")
	public String registerCheck(){
		return "Successfully register";
	}
	
	@RequestMapping("/register-user/{userName}/{password}")
	public String registerUser(@PathVariable("userName") String userName,@PathVariable("password") String password){
		
		System.out.println("======In register microservice from loging microservice");

		User u=new User();
		u.setId(2);
		u.setName(userName);
		u.setPassword(password);
		
		userRepo.save(u);
		System.out.println("======In register microservice from loging microservice end");

		return "Successfully register";
	}
}
