package com.wipro.orderms1.dto;

import com.wipro.orderms1.entity.Order;
import java.util.List;

public class OrderResponse {
    public Order order;
    public List<Payment> payments;

    public OrderResponse(Order order, List<Payment> payments) {
        this.order = order;
        this.payments = payments;
    }
}
