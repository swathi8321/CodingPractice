package com.practice.Arrays;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {


//		int value;
//		int val[] = new int[2];
//		for (int i = 0; i < nums.length; i++) {
//			value = target - nums[i];
//
//			for (int j = 0; j < nums.length; j++) {
//				if (i != j) {
//					if (value == nums[j]) {
//						val[0] = i;
//						val[1] = j;
//						return val;
//					}
//				}
//			}
//		}
//		return val;
    	
    	 Map<Integer,Integer> diffSumMap = new HashMap<Integer,Integer>();
         int[] result = new int[2];
         
         for(int i=0;i<nums.length;i++){
             
            if(diffSumMap.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = diffSumMap.get(target-nums[i]);
            }else{
                
                diffSumMap.put(nums[i],i);
                
            }
             
             
         }


 		
 		return result;

	
    }
}