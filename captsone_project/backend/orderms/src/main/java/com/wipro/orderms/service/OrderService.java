package com.wipro.orderms.service;

import com.wipro.orderms.entity.Order;
import java.util.List;

public interface OrderService {
    List<Order> findAll();
    Order findById(int id);
    Order save(Order order);
    void deleteById(int id);
}
