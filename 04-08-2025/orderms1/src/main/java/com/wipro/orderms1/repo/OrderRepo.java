package com.wipro.orderms1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.orderms1.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
}
