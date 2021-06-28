package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManipalArrayPractice {
	
	static float calculateRunRate(int bowled,float currentRunRate,int target) {
		
		return  ((target -(currentRunRate*bowled))/(50-bowled));
	}
	
	static void specialSquence(int n) {
		int[] arr = new int[n];
		arr[0]=2;
		arr[1]=1;
		arr[2]=3;
		
		for(int i=3;i<n;i++) {
			
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
			if(arr[i-1]>n) {
				break;
			}
			
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				break;
			}
			System.out.println(arr[i]);
		}
				
	}
	
	static void pattern(int n) {

		for (int i = 1; i <= n; i++) {

			if (i % 3 != 0) {
				for (int j = 0; j < i; j++) {
					System.out.print(i);
				}
				System.out.println("");

			}

		}

	}
	
	static void checkSumOfNumber(int n) {

		int sum = 0;
		int max = n+10;
		for (int i = n; i <= max; i++) {
			n=i;
			while(n>0) {
				
				sum += n%10;
				n = n/10;
				
			}
			
			if(sum == 9) {
				System.out.println(i);
			}
			//System.out.println(i +" and "+sum);
			sum =0;

		}

	}
	
	static void checkList(String str) {

		String[] x = str.split(",");
		
		List<Integer> strList = (List<Integer>) Arrays.asList(x).stream().map(i->Integer.parseInt(i)).collect(Collectors.toList()); ;
		System.out.println("List of Integer: " + strList);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int sum = 0;
		
		for(int i=0;i<strList.size();i++) {
		
			if(strList.get(i)>max) {
				max= strList.get(i);
			}
			if(strList.get(i)<min) {
				min= strList.get(i);
			}
			
			sum += strList.get(i);
		}
		System.out.println("Min Is "+min+" and Max is "+max+"Average is "+sum/strList.size());
	}

	static void checkList(String[][] arr,int num) {
		
		int index = (int)Math.sqrt(num);
		int mid = index/2;
		
		System.out.println("mid is "+mid);
		for(int i=0;i<index;i++) {
		
			System.out.println(arr[i][mid]);
		System.out.println(arr[mid][i]);
		}
	}


	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
		
//		System.out.println("Enter the number bowled so far");
//		int bowler = input.nextInt();
//		
//		System.out.println("Enter the run rate so far");
//		float runrate = input.nextFloat();
//		
//		System.out.println("Enter the target score so far");
//		int targetscore = input.nextInt();
//
//		
//		System.out.println("The value is"+calculateRunRate(bowler,runrate,targetscore));
		
		//pattern(5);
		checkSumOfNumber(1120);
		checkList("85,65,55,75,90");
		String[][] arr= {{"bob","amy","abu"},{"bek","ean","ira"},{"kim","nik","poe"}};
		checkList(arr,9);
	}

}
