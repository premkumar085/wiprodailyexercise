package com.wipro.order.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.wipro.order.dto.Payment;
import com.wipro.order.entity.Order;

public interface OrderService {
	
	List<Order> findAll();
	Order save(Order order, String token);
	Order findById(int id);
	ResponseEntity<String> delete(int id);
	ResponseEntity<String> update(int id, Order order);
	void pay(Payment payment);
	

}