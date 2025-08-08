package com.wipro.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 
public class StreamDemo5 {
 
	public static void main(String[] args) {
		
		Product p1= new Product("Mobile","i15Plus",85000);
		Product p2= new Product("Mobile","i16Plus",95000);
		Product p3= new Product("Mobile","M52",65000);
		Product p4= new Product("Fashion","T shirt",1000);
		Product p5= new Product("Fashion","Trouser",4000);
		Product p6= new Product("Kichen","Chimney",15000);
		Product p7= new Product("Kichen","Water Filter",25000);
		
		List<Product> prodList= new ArrayList<>();
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);
		prodList.add(p5);
		prodList.add(p6);
		prodList.add(p7);
		
		Comparator<Product> comp= (a,b)->{
			Double d1= Double.valueOf(a.prodPrice);
			Double d2= Double.valueOf(b.prodPrice);
			return d1.compareTo(d2);
		};
		
		//1 List of mobiles sorted by price
		List<Product> pList= prodList
		.stream()
		.filter(p->p.getProdCat().equalsIgnoreCase("Mobile"))
		.sorted(comp.reversed())
		.collect(Collectors.toList());
		
		System.out.println(pList);
		
		
	}
 
}