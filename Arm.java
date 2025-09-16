package com.codegnan.controlstatements;

import java.util.Scanner;

public class Arm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scanner.nextInt();

        int original = num;
        int count = 0;
        int sum = 0;

        // Step 1: Count digits
        int temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Step 2: Calculate Armstrong sum
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power *= digit;  // multiply digit 'count' times
            }

            sum += power;
            temp /= 10;
        }

        // Step 3: Check Armstrong
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        scanner.close();
    }

}


