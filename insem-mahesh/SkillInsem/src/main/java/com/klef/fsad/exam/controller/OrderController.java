package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.fsad.exam.model.Order;
import com.klef.fsad.exam.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order o) {
		return service.addOrder(o);
	}
	
	@GetMapping("/getOrders")
	public List<Order> getAllOrders(){
		return service.getOrderList();
	}
	
	@GetMapping("/getOrderById/{id}")
	public Order getOrderById(@PathVariable Long id) {
		return service.getOrderById(id);
	}
}


