package com.springshop.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springshop.user.entity.User;
import com.springshop.user.repository.UserRepository;
import com.springshop.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public String saveOrUpdateUser(User user) {
		userRepository.save(user);
		return "User saved successfully";
	}

}
