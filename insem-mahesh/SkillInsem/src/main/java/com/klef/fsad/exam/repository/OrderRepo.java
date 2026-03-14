package com.klef.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.fsad.exam.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{

}
