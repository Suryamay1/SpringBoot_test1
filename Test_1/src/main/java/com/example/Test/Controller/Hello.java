package com.example.Test.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/Hello")
	public String sayHello()
	{
		return "Hello World";
	}
}
