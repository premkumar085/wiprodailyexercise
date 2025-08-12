package com.wipro.orderms1.service;

import com.wipro.orderms1.entity.Order;
import java.util.List;

public interface OrderService {
    void save(Order order);
    List<Order> findAll();
}
