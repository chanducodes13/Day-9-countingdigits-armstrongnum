package com.codegnan.controlstatements;

import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int rem;
        int sum = 0;

        while (num != 0) {
            rem = num % 10;           // extract last digit
            num = num / 10;           // remove last digit
            sum = sum + rem * rem * rem; // cube and add
        }

        if (temp == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not an armstrong");
        }
        sc.close();
    }
}
