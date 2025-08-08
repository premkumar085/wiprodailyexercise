package com.wipro.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutoServiesDemo1 {

	public static void main(String[] args) {
		
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		ex.submit(()->
		
		
		{System.out.println("Task 1 submitted");
		
		});
		
	}

}
