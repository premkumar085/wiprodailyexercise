package com.wipro.annonymous;

public class Sayhellotest {

	public static void main(String[] args) {
		Greet hello = ()-> System.out.println("Hello Lambda");

	        hello.sayHello();
	}
}
