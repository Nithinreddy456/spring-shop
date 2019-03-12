package com.springshop.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springshop.user.entity.User;
import com.springshop.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@PutMapping("/")
	public String saveOrUpdateUser(@RequestBody User user) {
		return userService.saveOrUpdateUser(user);
	}
}
