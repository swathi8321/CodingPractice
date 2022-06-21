package com.practice.Arrays;

import java.util.*;
public class Practice {
	
	
	public List<Integer> removeDuplicate(int[] arr) {

		int count = 0;
		Map<Integer, List<Integer>> mp = new HashMap<>();
		
		for (int i : arr) {
			if (!mp.containsKey(i)) {

				mp.put(i, new ArrayList());

			}
			mp.get(i).add(mp.get(i).size()+1);
				
		}
		return new ArrayList(mp.values());

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> result = new ArrayList<List<String>>();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		int[] arr= {1,2,4,5,6,4,6,8,8,1,8,6,5,5,5,6,6,6};
		Practice g = new Practice();
		List<Integer> resultInt = g.removeDuplicate(arr);
		

	System.out.println(resultInt);

	//	System.out.println(Arrays.asList(resultInt).toString());
	}
}
