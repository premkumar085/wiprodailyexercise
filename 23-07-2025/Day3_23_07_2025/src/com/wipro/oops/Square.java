package com.wipro.oops;

public class Square {
	double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
