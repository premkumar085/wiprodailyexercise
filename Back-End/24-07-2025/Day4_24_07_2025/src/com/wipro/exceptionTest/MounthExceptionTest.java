package com.wipro.exceptionTest;

import com.wipro.exception.InvalidMonthException;

public class MounthExceptionTest {
	public static void checkMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month);
        }
        System.out.println("Valid month: " + month);
    }

    public static void main(String[] args) {
        try {
            checkMonth(17); 
        } catch (InvalidMonthException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}
