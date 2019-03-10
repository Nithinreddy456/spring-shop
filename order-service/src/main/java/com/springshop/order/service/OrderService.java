package com.springshop.order.service;

import java.util.List;

import com.springshop.order.entity.Order;

public interface OrderService {

	String saveOrUpdateOrderDetails(Order order);

	List<Order> getAllOrders();

}
