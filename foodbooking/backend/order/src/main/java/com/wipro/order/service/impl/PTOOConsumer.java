package com.wipro.order.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.order.dto.Payment;
import com.wipro.order.entity.Order;
import com.wipro.order.repo.OrderRepo;




@Service
public class PTOOConsumer {
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	KafkaTemplate kafkaTemplate;
	
	@KafkaListener(topics= com.wipro.order.util.AppConstant.INCOMING_TOPIC_NAME,groupId="payment_service")
	public void receiveUpiPayment(Payment payment) {
		System.out.println("---Message Received ---"+payment);
		Optional<Order> optOrder = orderRepo.findById(Integer.parseInt(payment.getOrderId()));
		if(optOrder.isPresent()) {
			Order order = optOrder.get();
			order.setOrderStatus(payment.getPaymentStatus());
			orderRepo.save(order);
					
		}
		
			
		
		
		
	}
	

}