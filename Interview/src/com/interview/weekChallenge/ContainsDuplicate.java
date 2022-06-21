package com.interview.weekChallenge;
import java.util.*;

//1. https://leetcode.com/problems/contains-duplicate/submissions/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer,Integer> containsDuplicate= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(containsDuplicate.containsKey(nums[i])){
                
                return true;
            }
            containsDuplicate.put(nums[i],0);
        }
        return false;
    }

}
