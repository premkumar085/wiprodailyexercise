package com.wipro.collection;

public class GenBoxtest {

	public static void main(String[] args) {
		GenBox<String> b = new GenBox("Prem");
       
        System.out.println(b.getData());

        GenBox<Integer> b1 = new GenBox(20);
        
        System.out.println(b1.getData());

	}

}
