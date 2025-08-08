package com.wipro.paymentms1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.paymentms1.entity.Payment;
import com.wipro.paymentms1.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping
    public void save(@RequestBody Payment payment) {
        paymentService.save(payment);
    }

    @GetMapping
    public List<Payment> findAll() {
        return paymentService.findAll();
    }

    @GetMapping("/{orderId}")
    public List<Payment> findByOrderId(@PathVariable int orderId) {
        return paymentService.findByOrderId(orderId);
    }
}
