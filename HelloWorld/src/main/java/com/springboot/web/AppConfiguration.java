package com.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
}