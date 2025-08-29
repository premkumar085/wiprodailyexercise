package com.wipro.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.payment.entity.Payment;


public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}