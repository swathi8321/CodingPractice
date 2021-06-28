package com.practice;

import java.util.Scanner;

public class Sum {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers");
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println("The sum is "+(a+b));
		
	}

}
