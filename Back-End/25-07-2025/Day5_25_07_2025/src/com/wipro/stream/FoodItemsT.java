package com.wipro.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FoodItemsT {

	public static void main(String[] args) {

		FoodItem f1 = new FoodItem("Fried Rice", "Veg", "Chinese", 150);
		FoodItem f2 = new FoodItem("Chicken Wings", "Non Veg", "Chinese", 250);
		FoodItem f3 = new FoodItem("Pad Thai", "Veg", "Thai", 180);
		FoodItem f4 = new FoodItem("Pizza", "Veg", "Continental", 200);
		FoodItem f5 = new FoodItem("Hakka Noodles", "Veg", "Chinese", 160);
		
		List<FoodItem> foodList = new ArrayList<>();
		foodList.add(f1);
		foodList.add(f2);
		foodList.add(f3);
		foodList.add(f4);
		foodList.add(f5);

		Comparator<FoodItem> comp = (a, b) -> {
			Double d1 = Double.valueOf(a.getPrice());
			Double d2 = Double.valueOf(b.getPrice());
			return d1.compareTo(d2);
		};

		
		List<FoodItem> chineseFoods = foodList
			.stream()
			.filter(f -> f.getCuisine().equalsIgnoreCase("Chinese"))
			.sorted(comp.reversed())
			.collect(Collectors.toList());
		
		//System.out.println(foodList);
		
		
		FoodItem expensive = chineseFoods.stream()
                .sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice())) 
                .findFirst()
                .orElse(null);

        System.out.println("Most Expensive Chinese Dish: " + expensive);

		
	}
}
