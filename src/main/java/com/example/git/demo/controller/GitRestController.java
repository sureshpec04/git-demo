package com.example.git.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitRestController {
	
	
	@GetMapping
	public String sayHello() {
		System.out.println("Added logging for rest endpoint");
		return "Hello GitHub from Eclipse";
	}
	
	@GetMapping("/employee/{id")
	public String findEmployeeById(@PathVariable(value = "id") final String id) {
		
		return "Found more employees with the id: " + id;
	}

}
