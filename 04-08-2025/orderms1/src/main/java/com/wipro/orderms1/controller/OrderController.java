package com.wipro.orderms1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.orderms1.entity.Order;
import com.wipro.orderms1.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping
    public void save(@RequestBody Order order) {
        orderService.save(order);
    }

    @GetMapping
    public List<Order> findAll() {
        return orderService.findAll();
    }
}
