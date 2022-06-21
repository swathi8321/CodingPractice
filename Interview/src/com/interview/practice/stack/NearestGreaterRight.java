package com.interview.practice.stack;

import java.util.Stack;

public class NearestGreaterRight {

	/*
	 * arr : 1,3,2,4
	 * 
	 * o/p: 3 4 4 -1
	 * 
	 * arr : 1 3 0 0 1 2 4 o/p : 3 4 1 1 2 4 -1
	 * https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1#
	 * 
	 */

	long[] nextLargerElement(long[] nums) {

		long[] ng = new long[nums.length];
		Stack<Long> stack = new Stack<Long>();

		for (int i = nums.length - 1; i >= 0; i--) {

			ng[i] = -1;

			while (!stack.isEmpty()) {
				long top = stack.peek();
				if (top > nums[i]) {
					ng[i] = top;
					break;
				} else {
					stack.pop();
				}
			}

			stack.push(nums[i]);

		}

		/*
		 * for(int i=arr.length;i>0;i--) ng[i] = -1; while(stack not empty){
		 * if(stack.top()>arr[i]) o/p is stack.top break; * else stack.pop(); }
		 * s.push[a[i]];
		 */

		return ng;

	}

}
