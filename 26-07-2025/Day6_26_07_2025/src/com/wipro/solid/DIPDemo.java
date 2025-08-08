package com.wipro.solid;

import java.util.Scanner;

public class DIPDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select payment method:\n1. PhonePe\n2. GPay\n3. Paytm");
        int choice = sc.nextInt();

        DigitalPayment payment = null;

        switch (choice) {
            case 1:
                payment = new PhonePay();
                break;
            case 2:
                payment = new GPay();
                break;
            case 3:
                payment = new Paytm();
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        payment.pay();

        sc.close();
    }
}

