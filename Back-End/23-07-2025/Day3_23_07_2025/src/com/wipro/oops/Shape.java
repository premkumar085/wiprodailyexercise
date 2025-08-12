package com.wipro.oops;

public class Shape {
	String color;
    double area;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Shape(String color, double area) {
		super();
		this.color = color;
		this.area = area;
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + ", area=" + area + "]";
	}

}
