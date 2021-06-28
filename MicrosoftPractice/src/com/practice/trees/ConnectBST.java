package com.practice.trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectBST {
	
	 public Node connect(Node root) {
	        Queue<Node>  queue = new LinkedList<>();
	        if(root != null) {
	            queue.offer(root);
	        }
	        
	        while(!queue.isEmpty()) {
	            int size = queue.size();
	            Node prev = null;
	            for(int i = 1; i <= size;  i++) {
	                Node current = queue.poll();
	                if(prev != null) {
	                    prev.next = current;
	                }
	                prev = current;
	                if(current.left != null){
	                    queue.offer(current.left);
	                }
	                if(current.right != null){
	                    queue.offer(current.right);
	                }
	            }
	        }
	        return root;
	    }

}
