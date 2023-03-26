package com.jwt.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.jwt.db.model.User;
import com.jwt.db.model.UserRepo;

@Controller
public class LoginContoller {

	@Autowired
	private UserRepo userRepo;
	
	RestTemplate restTemplate=new RestTemplate();
	
	@RequestMapping("/")
	public String checkMVC() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginHomePage(@RequestParam("userName") String userName,
			@RequestParam("password") String password,Model model) {
		User u = null;
		try {
			u=userRepo.findByName(userName);
		}catch(Exception e) {
			System.out.println("User not found!!!");
		}
		if(u!=null) {
			model.addAttribute("UserName",userName);
			return "homePage";
		}
		model.addAttribute("error", "User not fount in DB");
		return "login";
	}
	
	@RequestMapping("/register")
	public String goToRegistrationPage() {
		return "register";
	}
	
	@RequestMapping("/set-user")
	public String goToRegisterMicroservice(@RequestParam("userName") String userName, 
			@RequestParam("password1") String password1, 
			@RequestParam("password2") String password2,Model model) {
		//code to go to registration microservice to register user
		System.out.println("======going to register microservice from loging microservice");
		if(password1.equals(password2)) {
			restTemplate.getForObject("http://localhost:8083/register-user/"+userName+"/"+password1,
					 String.class);
			model.addAttribute("registersuccess","Successfully register");
		}else {
			model.addAttribute("registrationError", "Password not same.");
		}
		System.out.println("======going to register microservice from loging microservice end");

		return "login";
	}
	
}
