package com.wipro.collection;

public class GenDemotest {

	public static void main(String[] args) {
		
		//Gendemo <Integer>demo = new Gendemo(1);
	
		//Gendemo<String> demo1 = new Gendemo("Prem");
		
		GenDemo2<String,Integer> g1 = new GenDemo2();
		g1.printData("Prem", 1);
	//	GenDemo2<String,String> g1 = new GenDemo2();
	//	g1.printData("Prem", 1);
	}

}
