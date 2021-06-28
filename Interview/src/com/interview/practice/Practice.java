package com.interview.practice;

import java.util.Scanner;

public class Practice {
	 public boolean carPooling(int[][] trips, int capacity) {
	        int[] nums = new int[1000];
	        for (int[] t : trips) {
	            for (int i = t[1]; i < t[2]; i++)
	                nums[i] += t[0];
	        }
	        for (int t : nums) {
	            if (t > capacity) return false;
	        }
	        return true;
	    
	        
	    }
    public boolean carPooling2(int[][] trips, int capacity) {
    	int i=0;
    	int passenger = trips[i][0];
        int startingPoint = trips[i][1];
        int endingPoint = trips[trips.length-1][2];
        int[] nums = new int[1000];
        for (int[] t : trips) {
            for (int i1 = t[1]; i1 < t[2]; i1++)
            {
            	
                nums[i1] += t[0];
            System.out.println("t[1] is "+t[1]+" t[2] is"+t[2]+" nums[i1] is "+nums[i1]+" i1 is "+i1);
            }
        }
        for(int k=0;k<10;k++)
        {
        	System.out.println("the num["+k+"]"+nums[k]);
        }
        while(startingPoint<endingPoint)	
        {
        	if(passenger>capacity)
        	{
        		return false;
        	}
        	System.out.println(trips.length);
        	if(i+1 == trips.length)
        	{
        		if(passenger<=capacity)
        		{
        			return true;
        		}
        		return false;
        	}
        	if(trips[i +1][1]<= startingPoint)
        	{
        		passenger+=trips[i+1][0];
        		i++;
        	}
        	if(startingPoint == trips[i][2])
        	{
        		passenger =  passenger - trips[i][2];
        	}
        	startingPoint++;
        }
        return true;
    }

	public int[] twoSum(int[] nums, int target) {

		int value;
		int val[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			value = target - nums[i];

			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					if (value == nums[j]) {
						val[0] = i;
						val[1] = j;
						return val;
					}
				}
			}
		}
		return val;

	}

	public int minFlipsMonoIncr(String S) {
		int count = 0;
		int countOne = 0;
		int oneEnd = 0;
		int countBack = 0;
		int countOneBack = 0;
		if (S == null) {
			return 0;
		}
		System.out.println(S);
		int mid = S.length() / 2;
		int zeroEnd = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != '0') {
				zeroEnd = i;
				System.out.println(zeroEnd + "**" + i + "***" + S.charAt(i));
				break;
			}

		}
		for (int i = zeroEnd; i < S.length(); i++) {
			if (S.charAt(i) != '1') {
				count++;
			} else {
				countOne++;
			}
		}
		if(S.charAt(0)!='1')
		{
		for (int i = S.length() - 1; i >= 0; i--) {
			if (S.charAt(i) != '1') {
				oneEnd = i;
				break;
			}
		}
		for (int i = oneEnd; i > 0; i--) {
			if (S.charAt(i) != '0') {
				countBack++;
			} else {
				countOneBack++;
			}
		}
		}
		int minFwd = Math.min(count, countOne);
		int minBack = Math.min(countBack, countOneBack);
		return minFwd < minBack ? minFwd : minBack;

	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		Practice p = new Practice();
		//int[] value = p.twoSum(nums, target);

		//for (int i = 0; i < value.length; i++) {
			//System.out.print(value[i]);
		//}
		//Scanner input = new Scanner(System.in);
		//String s = input.next();
		//int output;
		//output=p.minFlipsMonoIncr(s);
		//System.out.print(output);
		int [][] trips =  {{3,2,7},{3,7,9},{8,3,9}};
		boolean output;
		int capacity = 14;
		output = p.carPooling(trips, capacity);
		System.out.print(output);
		
	}

}
