package com.interview.practice.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	/*https://www.youtube.com/watch?v=P1bAPZg5uaE&list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd
	 * 1. nearest greater to left
	 * 2. nearest greater to right
	 * 3. nearest smaller to left
	 * 4. nearest smaller to right
	 * 5. stock span 
	 * 6. maximum area of histogram
	 * 7. rain water trapping
	 * 8. max area of rectangle in binary matrix
	 * 
	 * 
	 * 9. rain water
	 * 10. implementing a min stack
	 * 11. stack using heap
	 * 12. longest valid parenthesis
	 * 13. iterative tower of hanoi
	 */
	
	/* 1.array means stack ..if sorting means heap
	 * 2.for loop twice means o(n2)  and dependent n2 loop
	 * for(int i=0;i<n;i++)
	 * 		for(int j=0;j<i;j++)
	 * 			j is dependant on i
	 * then usually its stack -try stack in that approach
	 */
	
	public static void main(String args[]) {
		NearestGreaterRight ne = new NearestGreaterRight();
		long nums[] = {1l,3l,2l,4l};
		long output[] = ne.nextLargerElement(nums);
		System.out.println(Arrays.toString(output));
		
		NearestGreaterLeft nel = new NearestGreaterLeft();
		 long output1[] = nel.nearestGreaterLeft(nums);
		System.out.println(" the value is "+Arrays.toString(output1));
		
		NearestSmallertoLeft nsl = new NearestSmallertoLeft();
		int arr[] = {1, 5, 0, 3, 4, 5};
		List<Integer> aar= nsl.leftSmaller1(arr);
		int[] aa=nsl.leftSmaller(arr);
		System.out.println("the nearest small"+Arrays.toString(aa));
		System.out.println("the nearest small"+Arrays.toString(aar.toArray()));
		
		
		NearestSmallerElementToRight nsr=new NearestSmallerElementToRight();
		int[] nsrarr=nsr.rightSmaller(arr);
		System.out.println("the nearest small right"+Arrays.toString(nsrarr));
		
		
		
	}

}
