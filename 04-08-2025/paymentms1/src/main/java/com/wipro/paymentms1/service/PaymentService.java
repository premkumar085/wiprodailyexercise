package com.wipro.paymentms1.service;

import java.util.List;
import com.wipro.paymentms1.entity.Payment;

public interface PaymentService {
    void save(Payment payment);
    List<Payment> findAll();
    List<Payment> findByOrderId(int orderId);
}
