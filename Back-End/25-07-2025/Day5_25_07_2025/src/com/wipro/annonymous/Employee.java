package com.wipro.annonymous;

public class Employee {
    String id;
    String name;
    int age;
    double salary;

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}
