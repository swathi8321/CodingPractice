package com.interview.practice;
//https://github.com/charlesbihis/sandbox/tree/0fe1e65d3ca7f126adb6fe0c40eb8f33fe62fa7a/java
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Combination {
	
	
	public void combination(String str) {
		
		char[] in = str.toCharArray();
		StringBuilder out = new StringBuilder();
		int length = str.length();
		
		combinationHelper(in,out,length,0,0);
		
	}
	
	public void combinationHelper(char[] in,StringBuilder out,int length,int level,int start) {
		
		for(int i=start;i<length;i++) {
			
			out.append(in[i]);
			System.out.println(out.toString());
			
			if(i< length -1) {
				combinationHelper(in,out,length,level+1,i+1);
			}
			
			out.setLength(out.length() - 1);
			
			
		}
		
		
	}
	
	
	public List<List<Integer>> subsets(int[] nums) {

		int[] in = nums;
		List<Integer> out = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<>();
		int start = 0;

		return subsetHelper(in, out, list, start);

	}
    
    
	public List<List<Integer>> subsetHelper(int[] in, List<Integer> out, List<List<Integer>> result, int start) {

		result.add(new ArrayList<>(out));

		for (int i = start; i < in.length; i++) {

			out.add(in[i]);
			subsetHelper(in, out, result, i + 1);

			out.remove(out.size() - 1);

		}

		return result;

	}
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {

		int[] in = nums;
		List<Integer> out = new ArrayList<Integer>();

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		int start = 0;

		Arrays.sort(in);

		return subsetsWithOutDupHelper(in, out, result, 0,2);

	}
	    
	public List<List<Integer>> subsetsWithOutDupHelper(int[] in, List<Integer> out, List<List<Integer>> result,
			int start,int length) {

		if(out.size() == length)
		result.add(new ArrayList<>(out));

		for (int i = start; i < in.length; i++) {
			
			if(i>start && in[i]==in[i-1]) continue;
			out.add(in[i]);
			subsetsWithOutDupHelper(in, out, result, i + 1,length);

			out.remove(out.size() - 1);

		}
		return result;

	}
	
	public static void main(String args[]) {
		
		Combination p = new Combination();
		p.combination("abcd");
		
		int[] arr = {1,2,3,4,1,2};
		
		List<List<Integer>> result = p.subsets(arr);
		
		for(int i=0;i<result.size();i++) {
			System.out.println("the valus is"+result.get(i));
		}
		
		result = p.subsetsWithDup(arr);
		for(int i=0;i<result.size();i++) {
			System.out.println("-----"+result.get(i));
		}
	}

}
