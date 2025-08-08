package com.wipro.collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Removingemp {

	public static void main(String[] args) {
		 List<Employee> list = new CopyOnWriteArrayList<>();

	        Employee e1 = new Employee("E1", "Prem", 23, 75000);
	        Employee e2 = new Employee("E2", "Vijay", 24, 90000);
	        Employee e3 = new Employee("E3", "Nani", 20, 85000);
	        Employee e4 = new Employee("E4", "Raju", 22, 100000);

	        list.add(e1);
	        list.add(e2);
	        list.add(e3);
	        list.add(e4);
	        System.out.println(list);
	        
	        for (Employee e : list) {
	            if (e.getEmpSalary() > 80000) {
	                list.remove(e);
	            }
	        }
	        for (Employee e : list) {
	            System.out.println(e);
	        }
	}

}
