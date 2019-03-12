package com.springshop.user.service;

import java.util.List;

import com.springshop.user.entity.User;

public interface UserService {

	List<User> getUsers();

	String saveOrUpdateUser(User user);

}
