package com.wipro.basic;

public class array2 {

	public static void main(String[] args) {
		int number[] = {1,1,2,2,3,4,4,5};
        int[] unique = new int[number.length];
        int count = 0;

        for (int i = 0; i < number.length; i++) {
            if (i == 0 || number[i] != number[i - 1]) {
                unique[count] = number[i];
                count++;
            }
        }

        System.out.println(count);

	}

}
