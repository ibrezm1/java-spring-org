package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value( "${test.message}" )
	private String testMessage;

	@Value( "${test.message2}" )
	private String testMessage2;

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/greet")
	public String greet() {
		return "Greetings from Spring " +  testMessage;
	}
	@GetMapping("/enc")
	public String enc() {
		return "Greetings from Spring " +  testMessage2;
	}
	
}
