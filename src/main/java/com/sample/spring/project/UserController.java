package com.sample.spring.project;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String welcome() {
		
		User user = new User(1001,"Anbu",30,89.2, 89.2, new java.util.Date(), new java.util.Date());
		userService.addUser(user);
		return "Hellow world";
		
	}

}
