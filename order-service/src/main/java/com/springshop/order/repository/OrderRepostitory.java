package com.springshop.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springshop.order.entity.Order;

public interface OrderRepostitory extends MongoRepository<Order, String> {

}
