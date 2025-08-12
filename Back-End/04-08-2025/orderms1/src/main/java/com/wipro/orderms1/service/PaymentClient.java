package com.wipro.orderms1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.orderms1.dto.Payment;

@FeignClient(name = "paymentms1")
public interface PaymentClient {
    @PostMapping("/payment")
    ResponseEntity<Payment> savePayment(@RequestBody Payment payment);

    @GetMapping("/payment/{orderId}")
    Payment[] getPaymentsByOrderId(@PathVariable int orderId);
}
