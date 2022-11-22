package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.services.UserService;
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/add")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user) ;
		
	}
	@GetMapping("/getUserByFname")
	public List<User> getUserByFname(@RequestParam String firstName){
		return userService.getUserByFname(firstName);
		
	}
	
	@GetMapping("/getUserByFnameLname")
	public List<User> getUserByFname(@RequestParam String firstName, @RequestParam String lastName){
		return userService.getUserByFname(lastName);
		
	}

}
