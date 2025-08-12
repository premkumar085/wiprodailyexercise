package com.wipro.annonymous;

import java.util.function.Consumer;

public class ConsummerTest {

	public static void main(String[] args) {
		
		
		Consumer<Integer> nextNumber = (num)-> System.out.println(num+1);
		
		nextNumber.accept(10);

	}

}
