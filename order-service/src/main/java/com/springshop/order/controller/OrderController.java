package com.springshop.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springshop.order.entity.Order;
import com.springshop.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}

	@PutMapping("/")
	public String saveOrUpdateOrderDetails(@RequestBody Order order) {
		return orderService.saveOrUpdateOrderDetails(order);
	}

}
