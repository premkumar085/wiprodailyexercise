package com.wipro.product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "product_name")
    String productName;

    @Column(name = "product_desc")
    String productDescription;

    @Column(name = "price")
    double price;

    @Column(name = "quantity")
    int quantity;

    @Column(name = "category")
    String category;

    @Column(name = "image_url")
    String imageUrl;
}
