package com.wipro.order.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class OrderItem {
	
	private Integer foodId;
    private Integer quantity;

}