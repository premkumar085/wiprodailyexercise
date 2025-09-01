package com.wipro.orderms.controller;

import com.wipro.orderms.entity.Order;
import com.wipro.orderms.service.OrderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*")
@Tag(name = "Order Management", description = "APIs for managing orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    @Operation(summary = "Get all orders ")
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get order by ID")
    public Order getOrderById(@PathVariable int id) {
        return orderService.findById(id);
    }

    @PostMapping
    @Operation(summary = "Create a new order")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Order created successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    public Order createOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update order by Id")
    public Order updateOrder(@PathVariable int id, @RequestBody Order order) {
        order.setOrderId(id);
        return orderService.save(order);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete order by ID ")
    public void deleteOrder(@PathVariable int id) {
        orderService.deleteById(id);
    }
}
