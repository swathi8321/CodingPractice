package com.interview.practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetIntegr {
	
    public static List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        subsets(nums, 0, val, res);
        return res;
        
    }
    
    public static void subsets(int[] nums, int level, List<Integer> val, List<List<Integer>> res) {
        if (level == nums.length) {
            res.add(new ArrayList(val));
            return;
        }
        // choose the current val
        val.add(nums[level]);
        subsets(nums, level + 1, val, res);
        val.remove(val.size() - 1);
        
        // not choose the current val
        subsets(nums, level + 1, val, res);
    }
    public static void main(String[] args)
    {
        int nums[]= {1,4,6,7,9};
       ; // Calling a function
        
        System.out.println( subsets(nums));
    }
}
