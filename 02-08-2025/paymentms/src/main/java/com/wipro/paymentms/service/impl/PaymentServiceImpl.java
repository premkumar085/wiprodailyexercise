package com.wipro.paymentms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.paymentms.entity.Payment;
import com.wipro.paymentms.repo.PaymentRepo;
import com.wipro.paymentms.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepo paymentRepo;

    @Override
    public void save(Payment payment) {
        paymentRepo.save(payment);
    }

    @Override
    public Payment findById(int id) {
        return paymentRepo.findById(id).orElse(null);
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepo.findAll();
    }

    @Override
    public void delete(int id) {
        paymentRepo.deleteById(id);
    }
}
