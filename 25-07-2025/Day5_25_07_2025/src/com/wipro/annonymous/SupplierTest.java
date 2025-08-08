package com.wipro.annonymous;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Double> rand = ()-> {return Math.random();};
		System.out.println(rand.get());
		
		Supplier<LocalDate> dt =() ->{return LocalDate.now();};
		System.out.println(dt.get());
	}

}
