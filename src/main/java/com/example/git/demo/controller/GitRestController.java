package com.example.git.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitRestController {
	
	
	@GetMapping
	public String sayHello() {
		return "Hello GitHub from Eclipse";
	}

}
