package com.wipro.oops;

public class Restaurant {
	String order_Name;
	int numberOfIdems;
	double price;
	
	public Restaurant() {
		
	}
	

	public Restaurant(String order_Name, int numberOfIdems, double price) {
		super();
		this.order_Name = order_Name;
		this.numberOfIdems = numberOfIdems;
		this.price = price;
	}


	public String getOrder_Name() {
		return order_Name;
	}

	public void setOrder_Name(String order_Name) {
		this.order_Name = order_Name;
	}

	public int getNumberOfIdems() {
		return numberOfIdems;
	}

	public void setNumberOfIdems(int numberOfIdems) {
		this.numberOfIdems = numberOfIdems;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Restaurant [order_Name=" + order_Name + ", numberOfIdems=" + numberOfIdems + ", price=" + price + "]";
	}
	

}
