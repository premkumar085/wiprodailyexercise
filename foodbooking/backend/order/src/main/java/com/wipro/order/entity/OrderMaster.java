package com.wipro.order.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_master")
@Data
public class OrderMaster {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="value")
    private int value;
}
