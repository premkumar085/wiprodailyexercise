package com.wipro.annonymous;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EmployeeSort {

	public static void main(String[] args) {
		
		class SortEmployee {

			public static void main(String[] args) {
				List<Employee> list = new ArrayList<>();
		        list.add(new Employee("E1", "Prem", 23, 50000));
		        list.add(new Employee("E2", "Vijay", 24, 60000));
		        list.add(new Employee("E3", "Nani", 20, 45000));

		        Comparator<Employee> bySalary = (e1, e2) -> {
		            Double d1 = Double.valueOf(e1.getSalary());
		            Double d2 = Double.valueOf(e2.getSalary());
		            return d1.compareTo(d2);
		        };

		        Collections.sort(list, bySalary);

		        list.forEach(e -> System.out.println(e));
		        

		        

			}

		}
	}

}
