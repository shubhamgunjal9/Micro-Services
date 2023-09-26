package com.porj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.porj.client.WelcomeClient;

@RestController
public class GreetController {
	
	@Autowired
	private WelcomeClient client;

	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg=client.involkeWelcomeMsg();
		return "Hello Good Morning" +msg;
	}
}
