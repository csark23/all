package com.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
	@RequestMapping("/home")
	public String home() {
		return "Wellcome to my page!!";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "Wellcome to my About page!!";
	}
}
