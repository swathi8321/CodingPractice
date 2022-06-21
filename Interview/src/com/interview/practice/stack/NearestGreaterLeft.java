package com.interview.practice.stack;

import java.util.Stack;

public class NearestGreaterLeft {
	
	/*
	 * arr[] : 1,3,2,4
	 * 
	 * o/p : -1,-1,3,-1
	 * 
	 * https://www.procoding.org/nearest-greater-to-left/
	 * 
	 * brute force
	 * for(int i=0;i<length;i++)
	 *  for(j=i-1;j>=0;j--)
	 *  
	 *  
	 */

	public long[] nearestGreaterLeft(long nums[]) {
		
		long[] ngl = new long[nums.length];
		Stack<Long> stack = new Stack<Long>();
		
		
		for(int i=0;i<nums.length;i++) {
			ngl[i]=-1;
			
			while(!stack.isEmpty()) {
				long top = stack.peek();
				if(top>nums[i]) {
					ngl[i]=top;
					break;
				}else {
					stack.pop();
				}
			}
			
			stack.push(nums[i]);
		}
		
		return ngl;
		
	}
	
	
}
