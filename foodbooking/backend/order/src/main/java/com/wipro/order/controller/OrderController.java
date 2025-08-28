package com.wipro.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.order.entity.OrderEntity;
import com.wipro.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    List<OrderEntity> findAll() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    OrderEntity findById(@PathVariable int id) {
        return orderService.findById(id);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable int id) {
        orderService.deleteById(id);
    }

    @PostMapping
    OrderEntity save(@RequestBody OrderEntity order,
                     @RequestHeader("Authorization") String authHeaderValue,
                     @RequestAttribute("userId") String userId) {
        order.setUserId(Integer.parseInt(userId));
        return orderService.save(order, authHeaderValue);
    }

    @PutMapping
    void update(@RequestBody OrderEntity order) {
        orderService.save(order, "");
    }
}
