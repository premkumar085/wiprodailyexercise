package com.wipro.menudemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuDemo {
	 static List<Employee> list=new CopyOnWriteArrayList <>();
	 public static void main(String[] args) {
		 int i=0;
		do {
		 
		System.out.println("----Menu-----"); 
		System.out.println("1. Add Employee");  
		System.out.println("2. Remove Employee"); 
		System.out.println("3. Print List"); 
		System.out.println("4. Exit"); 
		Scanner sc= new Scanner(System.in);
		 i=sc.nextInt();
		switch(i)
		{
			case 1:
				addEmployee();
				break;
			case 2: 
				removeEmployee();
				break;
			case 3: 
				printList();
				break;
			case 4: 
				break;
			default:
				System.out.println("Invalid Menu Option -please try again");
				break;
				
		}
		
		}while(i!=4);
		 
	}
	 
	public static void addEmployee()
	{
		System.out.println("Please enter employee name");
		Scanner sc= new Scanner(System.in);
		String name=sc.next();
		System.out.println("Please enter employee id");
		String empId=sc.next();
		System.out.println("Please enter employee salary");
		double empSalary=sc.nextDouble();		
		Employee emp=new Employee(name,empId,empSalary);
		list.add(emp);
	}
	public static void printList()
	{
		for(Employee emp:list)
		{
			System.out.println(emp);
		}
	}
	
	public static void removeEmployee()
	{
		System.out.println("Please enter employee id");
		Scanner sc= new Scanner(System.in);
		String empId=sc.next();
	    for(Employee emp:list)
	    {
	    	if(emp.empId.equalsIgnoreCase(empId))
	    	{
	    		list.remove(emp);
	    		System.out.println("Emplyoyee-"+emp.getName()+"-removed from the list");;
	    	}
	    }
	    
	}
}
