package com.interview.practice.stack;

import java.util.*;

/*
 * https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1
 */
public class NearestSmallertoLeft {
	
	public int[] leftSmaller(int a[]){
		
		List<Integer> arrayList= new ArrayList<>();
		int[] output = new int[a.length];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<a.length;i++) {
			
			arrayList.add(i, -1);
			output[i] = -1;
			
			while(!stack.empty()) {
				
				int top = stack.peek();
				
				if(top<a[i]) {
					arrayList.add(i,top);
					output[i]= top;
					break;
				}else {
					stack.pop();
				}
				
				
			}
			
			stack.push(a[i]);
			
		}
		
		
		return output;
		
		
	}
	
public List<Integer> leftSmaller1(int a[]){
		
		List<Integer> arrayList= new ArrayList<>();
		int[] output = new int[a.length];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<a.length;i++) {
			
			output[i] = -1;
			
			while(!stack.empty()) {
				
				int top = stack.peek();
				
				if(top<a[i]) {
					output[i]= top;
					break;
				}else {
					stack.pop();
				}
				
				
			}
			
			stack.push(a[i]);
			
		}
		
		
		 for(int i=0;i<output.length;i++) {
			 arrayList.add(output[i]);
		 }
		
		 return arrayList;
		
	}

}
