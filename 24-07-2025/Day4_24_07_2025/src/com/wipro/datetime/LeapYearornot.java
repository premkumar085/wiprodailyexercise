package com.wipro.datetime;

import java.time.LocalDate;

public class LeapYearornot {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2001, 1, 1); 
        System.out.println(isLeapYear(date));
    }

    public static boolean isLeapYear(LocalDate dt) {
        return dt.isLeapYear();
    }

	}

