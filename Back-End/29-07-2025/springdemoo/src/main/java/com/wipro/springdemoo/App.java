package com.wipro.springdemoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        
        Department dept = (Department) context.getBean("department");
        System.out.println(dept);
    }
}
