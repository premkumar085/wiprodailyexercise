package com.wipro.orderms1.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_data")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "order_number")
    String orderNumber;

    @Column(name = "order_value")
    double orderValue;

    @Column(name = "order_status")
    String orderStatus;
}
