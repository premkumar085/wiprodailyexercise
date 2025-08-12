package com.wipro.paymentms1.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.paymentms1.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {
    List<Payment> findByOrderId(int orderId);
}
