package com.wipro.paymentms1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.paymentms1.entity.Payment;
import com.wipro.paymentms1.repo.PaymentRepo;
import com.wipro.paymentms1.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentRepo paymentRepo;

    public void save(Payment payment) {
        paymentRepo.save(payment);
    }

    public List<Payment> findAll() {
        return paymentRepo.findAll();
    }

    public List<Payment> findByOrderId(int orderId) {
        return paymentRepo.findByOrderId(orderId);
    }
}
