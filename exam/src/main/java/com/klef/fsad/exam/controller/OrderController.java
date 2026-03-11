package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Order;
import com.klef.fsad.exam.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController 
{
    @Autowired
    OrderService service;

    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order)
    {
        return service.addOrder(order);
    }

    @GetMapping("/all")
    public List<Order> getOrders()
    {
        return service.getOrders();
    }
}