package com.wipro.datetime;

import java.time.LocalDate;

public class Birthdate {

	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(2002, 2, 24); 
        int age = getAge(birthDate);
        System.out.println(age);
    }

    public static int getAge(LocalDate dt) {
        return getAge(dt);
    }
	}


