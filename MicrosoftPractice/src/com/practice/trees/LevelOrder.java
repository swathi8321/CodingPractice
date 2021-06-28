package com.practice.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrder {
	
	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> res = new ArrayList<>();

		if (root == null) {
			return res;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {

			List<Integer> temp = new ArrayList<Integer>();
			int cnt = queue.size();

			for (int i = 0; i < cnt; i++) {

				TreeNode node = queue.poll();
				temp.add(node.val);

				if (node.left != null) {
					queue.add(node.left);
				} 
				
				if(node.right != null) {
					queue.add(node.right);
				}

			}

			res.add(temp);

		}

		return res;

	}

	public static void main(String[] args) {
		
		LevelOrder lv = new LevelOrder();
		
		TreeNode tree = new TreeNode(0);
		tree = new TreeNode(85);
		tree.right = new TreeNode(15);
		tree.left = new TreeNode(4);
		tree.right.left = new TreeNode(20);

		List<List<Integer>> result = lv.levelOrder(tree);

		System.out.println("*****" + result);
		

	}

}
