package com.interview.practice;

public class PracticeTree {
	
	class TreeNode{
		
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
		
	}
	
	  public int pathSum(TreeNode root, int sum) {
	        int res = pathSumHelper(root, sum);
	        if(root != null){
	            res += pathSum(root.left, sum) + pathSum(root.right, sum);
	        }
	        return res;
	    }
	    public int pathSumHelper(TreeNode root, int sum){
	        if(root == null)    return 0;
	        int res = root.val == sum? 1 : 0;
	        return res + pathSumHelper(root.left, sum - root.val) + pathSumHelper(root.right, sum - root.val);
	    } 

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		Practice p = new Practice();
		int[] value = p.twoSum(nums, target);

		for (int i = 0; i < value.length; i++) {
			System.out.print(value[i]);
		}

	}

}
