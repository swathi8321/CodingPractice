package com.interview.practice.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
	
	public void subset(String input,String output,List<String> result) {
	
		System.out.println("|"+input+"|"+output);
		 
		if(input.length() == 0) {
			
			result.add(output);
			//System.out.println(result);
			return ;
		}
		StringBuilder outputExclude = new StringBuilder();
		outputExclude.append(output);
		
		StringBuilder outputInclude = new StringBuilder();
		outputInclude.append(output);
		outputInclude.append(input.charAt(0));
		
		input = input.substring(1);
		subset(input,outputInclude.toString(),result);
		subset(input,outputExclude.toString(),result);
		
	
		
		//return result;
		
		
		
	}
	
	public List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> output = new ArrayList<Integer>();
		 subsetHelper(nums,output,result);
		return result;
	}
	
	public void subsetHelper(int[] nums,List<Integer> output,List<List<Integer>> result) {
		System.out.println("*"+nums.length+"*"+output+"*"+result);
		if(nums.length == 0) {
			result.add(output);
			
			return;
		}
		
		List<Integer> outputExclude = new ArrayList<Integer>();
		outputExclude = output;
		List<Integer> outputInclude = new ArrayList<Integer>();
		outputInclude = output;
		outputInclude.add(nums[0]);
		
		int[] modified = Arrays.copyOfRange(nums, 1, nums.length);
		//subsetHelper(modified,outputExclude,result);
		output.remove(output.size() - 1);
		subsetHelper(modified,outputInclude,result);
		//output.clear();
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subset s = new Subset();
		List<String> result= new ArrayList<String>();
		 s.subset("abc", " ",result);
		System.out.println(result);
		int[] nums = {1,2,3};
		System.out.println(s.subsets(nums));
	}

}


