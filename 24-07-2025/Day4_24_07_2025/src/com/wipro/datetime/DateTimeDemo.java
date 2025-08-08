package com.wipro.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
	public static void main(String[] args) {
		
//		LocalDate dt = LocalDate.now();
//		System.out.println(dt);
//		LocalDate dt1 = LocalDate.now();
//		System.out.println(dt1);
//		LocalDate dt2 = LocalDate.now();
//		System.out.println(dt2);
//		LocalDate dt3 = LocalDate.EPOCH;
//		System.out.println(dt3);
		
		LocalDateTime dtm1 = LocalDateTime.now();
		System.out.println(dtm1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd");
		System.out.println(dtm1.format(formatter));
		
		LocalTime dtm2 = LocalTime.now();
		System.out.println(dtm2);
		
		LocalDate dt6 = LocalDate.of(1990, 1,10);
		System.out.println(dt6);


	}
	//public static int getAge(LocalDate dt) {
		
	}


