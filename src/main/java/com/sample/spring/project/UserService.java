package com.sample.spring.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	
	
	@Autowired
	UserRepository repository;
	
	public String addUser(User user) {
		
		repository.save(user);
		return "Success";
		
	}

}
