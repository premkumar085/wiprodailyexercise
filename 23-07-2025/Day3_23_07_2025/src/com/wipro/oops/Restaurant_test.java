package com.wipro.oops;

public class Restaurant_test {

	public static void main(String[] args) {
		 Restaurant r1 = new Restaurant("Paneer Butter Masala", 2, 500.0);
	        System.out.println(r1);

	        // Using default constructor and setters
	        Restaurant r2 = new Restaurant();
	        r2.setOrder_Name("Veg Biryani");
	        r2.setNumberOfIdems(1);
	        r2.setPrice(250.0);
	        System.out.println(r2);

	        // Another example
	        Restaurant r3 = new Restaurant("Dosa", 3, 180.0);
	        System.out.println(r3);
	    

	}

}
