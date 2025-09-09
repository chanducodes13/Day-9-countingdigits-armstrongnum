package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		int count=0;
		while(number!=0) {
			number/=10;
			count++;
		}
		System.out.println("count of given number is:"+count);
		sc.close();

	}

}
