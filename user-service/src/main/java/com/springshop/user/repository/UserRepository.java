package com.springshop.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springshop.user.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

}
