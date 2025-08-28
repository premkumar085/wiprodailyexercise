package com.wipro.food.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "food")
public class Food {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name = "food_name")
	String foodName;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "image_link")
	String image;
	
	@Column(name = "price")
	double price;


}