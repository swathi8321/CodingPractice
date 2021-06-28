package com.practice.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLinks {
	
	 public Node connect(Node root) {
	        
	      connectHelper(root);
	      return root;
	 }
	 
	 public void connectHelper(Node root) {
		 if(root == null && root.left == null|| root.right == null) {
			 return ;
		 }
		 root.left.next = root.right;
		 
		 if(root.next != null)  root.right.next = root.left.next;
		 
		 connectHelper(root.left);
		 connectHelper(root.right);
		 
		 
		 
	 }
}

	 