package com.wipro.annonymous;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierDate {

	public static void main(String[] args) {
		 Supplier<String> tomorrow = () -> LocalDate.now().plusDays(1)
				 .format(DateTimeFormatter.ofPattern("E"));
	     System.out.println(tomorrow.get());
	}

}
