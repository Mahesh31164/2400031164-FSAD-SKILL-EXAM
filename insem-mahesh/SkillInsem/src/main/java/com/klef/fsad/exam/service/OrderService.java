package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Order;
import com.klef.fsad.exam.repository.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepo repo;
	
	public Order addOrder(Order o) {
		return repo.save(o);
	}
	
	public List<Order> getOrderList() {
		return repo.findAll();
	}
	
	public Order getOrderById(Long id) {
		Order o = repo.findById(id).orElseThrow();
		return o;
	}

}
