package com.practice.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class InOrder {
	
	  public List<Integer> inorderTraversal(TreeNode root) {
		  List<Integer> l = null;
		  Queue<TreeNode> inOrder = new LinkedList<>(); 
		  
		  TreeNode temp = root;
		  while(temp != null || !inOrder.isEmpty()) {
			  if(temp.left != null) {
				  
				  inOrder.add(temp);
				  temp = temp.left;
				  
			  }else {
				  
				  temp = inOrder.remove();
				  System.out.println(temp.val);
				  temp = temp.right;
			  }
			  
			 
			  
			  
		  }
		  return l;
	        
	    }
	  public List<Integer> InorderTraversal1(TreeNode root) 
	    {
	        List<Integer> list = new LinkedList<Integer>();
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        TreeNode node = root;
	        while (node != null || !stack.isEmpty())
	        {
	            if (node != null)
	            {
	                stack.push(node);
	                node = node.left;
	            }
	            else
	            {
	                node = stack.pop();
	                System.out.println(node.val);
	                list.add(node.val);
	                node = node.right;
	            }
	        }
	        
	        return list;
	    }
	  
	  public static void main(String[] args) {
		  InOrder bst = new InOrder();

			TreeNode tree = new TreeNode(0);
			tree = new TreeNode(85);
			tree.right = new TreeNode(15);
			tree.left = new TreeNode(4);
			tree.right.left = new TreeNode(20);

			List<Integer> result = bst.inorderTraversal(tree);
			System.out.println("*****" + result);
			result = bst.InorderTraversal1(tree);

			System.out.println("*****" + result);
		}


}
