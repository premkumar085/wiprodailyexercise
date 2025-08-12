package com.wipro.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

	public static void main(String[] args) {
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<String> future = ex.submit(()->{
			
			System.out.println("Tasl1 running");
			return "I am Done!";
		});
		
		

	}

}
