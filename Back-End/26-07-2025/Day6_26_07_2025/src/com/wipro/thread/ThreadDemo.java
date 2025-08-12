package com.wipro.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("--main thread ends--");

		MyThread t = new MyThread();
		t.start();
		System.out.println("--main thread ends--");
	}

}
