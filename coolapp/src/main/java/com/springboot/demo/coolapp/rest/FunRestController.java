package com.springboot.demo.coolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// enable home route to return hello world
	
	@GetMapping("/")
	public String sayHello(){
		return "Hello World! Time on the server is " + LocalDateTime.now();	}
	
}
