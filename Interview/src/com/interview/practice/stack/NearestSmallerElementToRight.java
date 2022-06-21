package com.interview.practice.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmallerElementToRight {
public int[] rightSmaller(int a[]){
		
		List<Integer> arrayList= new ArrayList<>();
		int[] output = new int[a.length];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=a.length-1;i>=0;i--) {
			
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
		
		
		return output;
		
		
	}
}
