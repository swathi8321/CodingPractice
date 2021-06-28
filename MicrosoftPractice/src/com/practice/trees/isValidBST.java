package com.practice.trees;

import com.practice.LinkedList.ListNode;

public class isValidBST {
	public boolean isValidBST1(TreeNode root) {
		if (root == null) {
			return true;
		}

		TreeNode temp = root;

		while (temp != null) {
			if (temp.left != null && temp.right != null) {
				if (temp.left.val > temp.val) {
					return false;
				} else if (temp.right.val < temp.val) {
					return false;
				}
			}

			temp = temp.left == null ? null : temp.left;

		}

		temp = root;

		while (temp != null) {

			if (temp.left != null && temp.right != null) {
				if (temp.left.val > temp.val) {
					return false;
				} else if (temp.right.val < temp.val) {
					return false;
				}
			}

			temp = temp.right == null ? null : temp.right;

		}
		
		return true;

	}

	public static void main(String[] args) {
		isValidBST bst = new isValidBST();

		TreeNode tree = new TreeNode(0);
		tree = new TreeNode(85);
		tree.right = new TreeNode(15);
		tree.left = new TreeNode(4);
		tree.right.left = new TreeNode(20);

		boolean result = bst.isValidBST1(tree);

		System.out.println("*****" + result);
	}

}
