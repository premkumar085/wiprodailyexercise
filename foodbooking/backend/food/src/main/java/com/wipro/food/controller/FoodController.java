package com.wipro.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.food.entity.Food;
import com.wipro.food.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
	
	@Autowired
	FoodService foodService;
	
	@PostMapping
	void save(@RequestBody Food food) {
		foodService.save(food);
	}
	
	@GetMapping
	List<Food> findAll(){
		
		return foodService.findAll();
	}
	
	@GetMapping("/{id}")
	Food findById(@PathVariable int id) {
		return foodService.findById(id);
		
	}
	
	@PutMapping("/{id}")
	void update(@PathVariable int id, @RequestBody Food food) {
		
		foodService.update(id, food);
		
	}
	
	@DeleteMapping("/{id}")
	void delete(@PathVariable int id) {
		foodService.delete(id);
	}

}