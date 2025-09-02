package com.wipro.product.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


@Data
public class Order {
	
    int orderId;
    
    int userId; 
    
    
    Map<Integer, Integer> productQuantityMap = new HashMap<>();
    
    Double totalAmount;
    String orderStatus; 
    
    LocalDateTime orderDate;
}