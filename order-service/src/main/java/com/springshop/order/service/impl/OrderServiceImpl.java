package com.springshop.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springshop.order.entity.Order;
import com.springshop.order.repository.OrderRepostitory;
import com.springshop.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepostitory orderRepostitory;

	@Override
	public List<Order> getAllOrders() {
		return orderRepostitory.findAll();
	}

	@Override
	public String saveOrUpdateOrderDetails(Order order) {
		orderRepostitory.save(order);
		return "Order Saved Successfully";
	}

}
