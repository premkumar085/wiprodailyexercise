package com.wipro.exceptionTest;

import com.wipro.exception.StaticDemo;

public class Statictest {
	public static void main(String[] args) {
		
		StaticDemo demo1 = new StaticDemo();
		demo1.staticData=17;
		demo1.nonStaticData = 10;
		
		StaticDemo demo2 = new StaticDemo();
		System.out.println(demo2.staticData);
		System.out.println(demo2.nonStaticData);



	}

}
