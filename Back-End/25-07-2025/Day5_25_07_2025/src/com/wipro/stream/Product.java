package com.wipro.stream;

public class Product {
	
	String prodCat;
	String prodName;
	double prodPrice;
	public Product(String prodCat, String prodName, double prodPrice) {
		super();
		this.prodCat = prodCat;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		
	}
	public String getProdCat() {
		return prodCat;
	}
	public void setProdCat(String prodCat) {
		this.prodCat = prodCat;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product [prodCat=" + prodCat + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
	


	

}
