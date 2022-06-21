package com.interview.weekChallenge;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
	 public int[] twoSum(int[] nums, int target) {
	        Map<Integer,Integer> hmMap=new HashMap<>();
	        int[] arrayList= new int[2];
	        
	        for(int i=0;i<nums.length;i++){
	            hmMap.put(nums[i],i);
	        }
	        
	        for(int i=0;i<nums.length;i++){
	            int sum = target-nums[i];
	            
	            if(hmMap.containsKey(sum) && hmMap.get(sum) != i){
	                arrayList[0]=i;
	                arrayList[1]=hmMap.get(sum);
	            }
	            
	        }
	        
	        return arrayList;
	        
	    }

}
