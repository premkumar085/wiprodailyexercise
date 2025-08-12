package com.wipro.datetime;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo1 {

	public static void main(String[] args) {
		
		
		LocalDate date = LocalDate.of(2023, 11, 1);
		
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(date.format(formatter));  // Output: 01-11-2023
	}
}

