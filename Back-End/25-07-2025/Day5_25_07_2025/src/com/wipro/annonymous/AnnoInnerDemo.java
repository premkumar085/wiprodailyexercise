package com.wipro.annonymous;

public class AnnoInnerDemo {

	public static void main(String[] args) {
		
		Shape rectangle = new Shape() {
			public void draw() {
				System.out.println("Drawing Rectangle");
			}
		};
		
		rectangle.draw();
		
		Shape r = ()->{System.out.println("Drawing Rectangle");};
		
		r.draw();
		
		

	}

}
