package com.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String getWelcomeMsg() {
		return "Heloo World";
	}
}
