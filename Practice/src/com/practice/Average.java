package com.practice;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int[5];
		int sum = 0;

		
		System.out.println("Enter 5 numbers");
		
		for(int i=0;i<5;i++) {
			a[i] = input.nextInt();
			sum += a[i];
		}
		
		System.out.println("The avergae is "+sum/5);
		
		
		
	}

}
