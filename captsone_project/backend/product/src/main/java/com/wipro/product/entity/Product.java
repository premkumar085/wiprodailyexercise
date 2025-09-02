package com.wipro.product.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false)
    private String prodName;

    private String prodDesc;
    private String prodCat; 
    private String make;

    private int availableQty;
    private double price;
    private String uom; 
    private double prodRating;
    private String imageURL;

    private LocalDate dateOfManufacture;
}
