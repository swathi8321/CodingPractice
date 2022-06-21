	package com.interview.practice;



public class PracticeBinaryTree {



//find common ancestor of 2 nodes
public int leastCommonAncestor(TreeNode root, int val1, int val2) {

		if (root == null) {
			return 0;
		}

		while (root != null) {

			if (val1 > root.val && val2 > root.val) {
				root = root.right;
			} else if (val1 < root.val && val2 < root.val) {
				root = root.left;
			} else {
				return root.val;
			}
		}

		return 0;
	}

public static void main(String args[])  
{ 
	
	PracticeBinaryTree PBT = new PracticeBinaryTree();

	TreeNode tree = new TreeNode(20);
    tree.left = new TreeNode(8); 
    tree.right = new TreeNode(22); 

   tree.left.left = new TreeNode(4); 
    tree.left.right = new TreeNode(12); 
   

  
    tree.left.right.left = new TreeNode(10); 
    tree.left.right.right = new TreeNode(14); 
//    tree.right.left.left = new TreeNode(12); 
//    tree.right.left.right = new TreeNode(13); 
//    tree.right.right.left = new TreeNode(14); 
//    tree.right.right.right = new TreeNode(15); 
//
//    tree.left.left.left.left = new TreeNode(16); 
//    tree.left.left.left.right = new TreeNode(17); 
//    tree.left.left.right.left = new TreeNode(18); 
//    tree.left.left.right.right = new TreeNode(19); 
//    tree.left.right.left.left = new TreeNode(20); 
//    tree.left.right.left.right = new TreeNode(21); 
//    tree.left.right.right.left = new TreeNode(22); 
//    tree.left.right.right.right = new TreeNode(23); 
//    tree.right.left.left.left = new TreeNode(24); 
//    tree.right.left.left.right = new TreeNode(25); 
//    tree.right.left.right.left = new TreeNode(26); 
//    tree.right.left.right.right = new TreeNode(27); 
//    tree.right.right.left.left = new TreeNode(28); 
//    tree.right.right.left.right = new TreeNode(29); 
//    tree.right.right.right.left = new TreeNode(30); 
//    tree.right.right.right.right = new TreeNode(31); 

    System.out.println("Specific Level Order traversal of binary" 
                                                        +"tree is "); 
    System.out.println(PBT.leastCommonAncestor(tree, 4, 19));
} 

}
