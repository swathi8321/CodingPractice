package com.practice.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagOrder {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		List<List<Integer>> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		
		
		Queue<TreeNode> tempQueue = new LinkedList<>();
		tempQueue.add(root);

		boolean zigzag = true;

		while (!tempQueue.isEmpty()) {

			List<Integer> temp = new ArrayList<Integer>();
			int cnt = tempQueue.size();
			List<Integer> level = new ArrayList<>();

			for (int i = 0; i < cnt; i++) {
				TreeNode levelVal = tempQueue.poll();
				temp.add(levelVal.val);

				if (zigzag) {
					level.add(0, levelVal.val);
				} else {
					level.add(levelVal.val);
				}

				if (levelVal.left != null) {
					tempQueue.add(levelVal.left);
				}
				if (levelVal.right != null) {
					tempQueue.add(levelVal.right);
				}

			}
			result.add(level);

			zigzag = !zigzag;
		}
		
		
		return result;

	}
	public static void main(String[] args) {
		ZigZagOrder zigO = new ZigZagOrder();
		LevelOrder lv = new LevelOrder();
		TreeNode tree = new TreeNode(0);
		tree = new TreeNode(85);
		tree.right = new TreeNode(15);
		tree.left = new TreeNode(4);
		tree.right.left = new TreeNode(20);
		tree.right.right = new TreeNode(26);

		List<List<Integer>> result = zigO.zigzagLevelOrder(tree);
		List<List<Integer>> result1 = lv.levelOrder(tree);

		System.out.println("*****" + result);
		System.out.println("*****" + result1);
		

	}

}
