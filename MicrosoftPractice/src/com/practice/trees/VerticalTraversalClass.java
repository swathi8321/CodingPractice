package com.practice.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalTraversalClass {

	public ArrayList<Integer> verticalTraversal(TreeNode root) {
		
		Map<Integer,List<Integer>> mp = new HashMap<Integer,List<Integer>>();
		
		int arr[] = new int[2];
		arr[0] = 0;
		arr[1] =0;
		
		Map<Integer,List<Integer>> result = verticalHeightHelper(root,mp,arr,arr);
		ArrayList<Integer> result1 = new ArrayList<Integer>();
		return result1;

	}

	private Map<Integer, List<Integer>> verticalHeightHelper(TreeNode root, Map<Integer, List<Integer>> mp, int[] arr,
			int[] arr2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
