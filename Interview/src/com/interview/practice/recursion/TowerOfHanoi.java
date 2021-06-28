package com.interview.practice.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	private static int count;
	public static void printTowerofHanoi(int n,int source,int dist,int helper) {
		if(n == 1) {
			count++;
			System.out.println("["+count+"]Move "+n +" from "+ source +" to "+dist);
			return;
		}
		
		printTowerofHanoi(n-1,source,helper,dist);
		System.out.println("Move "+(n-1) +" from "+ source +" to "+dist);
		printTowerofHanoi(n-1,helper,dist,source);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int value = s.nextInt();
		int source = 1;
		int helper = 2;
		int dist = 3;
		printTowerofHanoi(value,source,dist,helper);

	}

}
