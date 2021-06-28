package com.practice.Arrays;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] nums = {2,5,7,12,15};
		int target =9;
		int[] result = s.twoSum(nums, target);
		
		for(int x : result) {
			System.out.println("value is "+x);
		}
	}

}
