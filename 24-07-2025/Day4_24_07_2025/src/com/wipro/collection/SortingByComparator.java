package com.wipro.collection;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class SortingByComparator {

	    public static void main(String[] args) {
	        List<Employee> list = new ArrayList<>();

	        Employee e1 = new Employee("E1", "Prem", 23, 50000);
	        Employee e2 = new Employee("E2", "Vijay", 24, 60000);
	        Employee e3 = new Employee("E3", "Nani", 20, 45000);

	        list.add(e1);
	        list.add(e2);
	        list.add(e3);

	        Collections.sort(list, (a, b) -> a.getEmpName().compareTo(b.getEmpName()));

	      
	        list.forEach(System.out::println);
	    }
	}
