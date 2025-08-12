package com.wipro.basic;

public class Enum_month {

	public static void main(String[] args) {
		enum Month{
			January, 
			February, 
			March, 
			April, 
			May, 
			June, 
			July, 
			August, 
			September, 
			October, 
			November,
			December
		}
		Month month = Month.February;
		if(month==Month.February) {
			System.out.println("February");
		}
			

	}

}
