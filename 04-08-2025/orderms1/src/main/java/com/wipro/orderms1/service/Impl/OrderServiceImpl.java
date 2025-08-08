package com.wipro.orderms1.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.orderms1.dto.Payment;
import com.wipro.orderms1.entity.Order;
import com.wipro.orderms1.repo.OrderRepo;
import com.wipro.orderms1.service.OrderService;
import com.wipro.orderms1.service.PaymentClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    PaymentClient paymentClient;

    @Override
    @CircuitBreaker(name = "order-cb", fallbackMethod = "handleFallback")
    public void save(Order order) {
        order.setOrderStatus("I");
        orderRepo.save(order);

        Payment payment = new Payment();
        payment.setOrderId(order.getId());
        payment.setPaymentAmount(order.getOrderValue());
        payment.setPaymentStatus(true);

        ResponseEntity<Payment> response = paymentClient.savePayment(payment);

        if (response != null && response.getStatusCode().is2xxSuccessful()) {
            order.setOrderStatus("P");
        } else {
            order.setOrderStatus("C");
        }

        orderRepo.save(order);
    }

    public void handleFallback(Order order, Throwable t) {
        System.out.println("-- Circuit Breaker Triggered -- " + t.getMessage());
        order.setOrderStatus("C");
        orderRepo.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepo.findAll();
    }
}
