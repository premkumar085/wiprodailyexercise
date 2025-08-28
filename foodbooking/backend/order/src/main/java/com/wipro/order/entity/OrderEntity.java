package com.wipro.order.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_details")
@Data
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="order_id")
    private String orderId;

    @Column(name="user_id")
    private int userId;

    @Column(name="food_id")
    private int foodId;

    @Column(name="quantity")
    private int quantity;

    @Column(name="order_price")
    private double totalOrderPrice;

    @Column(name="order_status")
    private int orderStatus;
}
