package com.wipro.annonymous;

import java.util.function.Consumer;

public class ConsummerEven {

	public static void main(String[] args) {
		Consumer<Integer> nextEven = n -> System.out.println(n % 2 == 0 ? n + 2 : n + 1);		System.out.println();
		nextEven.accept(100);
		
		

	}

}
