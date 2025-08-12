package com.wipro.annonymous;

public class LamtaTest1 {

	public static void main(String[] args) {
		AddFn addFn = (a,b)-> {return a+b;};
		
		int x = addFn.sum(2,3);
		System.out.println(x);
		

	}

}
