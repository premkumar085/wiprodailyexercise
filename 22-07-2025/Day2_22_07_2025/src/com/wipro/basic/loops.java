package com.wipro.basic;

public class loops {

	public static void main(String[] args) {
		
		/*for(int i=0;i<=10;i=i+2) {
			System.out.println(i);
		}
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
		}*/
		
		/*
		int i = 0;
		while(i>=0) {
			System.out.println(i);
			i= i-2;
		}
		do {
			System.out.println(i);
			i= i-2;
		}while(i>=0);
		*/
		
		int sum  = 0;
		for(int i=2;i<=100;i=i+2) {
			sum +=i;
			System.out.println(sum);
		}

	}

}
