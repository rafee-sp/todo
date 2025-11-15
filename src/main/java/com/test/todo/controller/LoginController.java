package com.test.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login() {		
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String home(@RequestParam String username,@RequestParam String password) {		
		return "home";
	}

}
