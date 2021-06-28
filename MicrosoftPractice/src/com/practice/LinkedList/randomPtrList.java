package com.practice.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class randomPtrList {
	
	 public Node copyRandomList(Node head) {
	        
	        Node tempNode = new Node();
	        tempNode = head;
	        
	        Map<Node,Node> randomptrMap = new HashMap<Node,Node>();
	        Node newNode = null;
	        
	        while(tempNode!= null){
	        	 newNode = new Node(tempNode.val,tempNode.next,tempNode.random);
	            randomptrMap.put(tempNode,newNode);
	            tempNode = tempNode.next;
	        }
	        
	        tempNode = head;
	        
	        
	        while(tempNode != null){
	        	newNode = randomptrMap.get(tempNode);
	            newNode.next =  randomptrMap.get(tempNode.next);;
	            newNode.random = randomptrMap.get(tempNode.random);;
	        }
	        
	        return newNode;
	    
	    }

	 void print(Node head) 
	    { 
	        Node temp = head; 
	        while (temp != null) 
	        { 
	            Node random = temp.random; 
	            int randomData = (random != null)? random.val: -1; 
	            System.out.println("Data = " + temp.val + 
	                               ", Random data = "+ randomData); 
	            temp = temp.next; 
	        } 
	    } 
	public static void main(String[] args) {
		
		randomPtrList r = new randomPtrList();
		
		Node list = new Node(); 
		 list = new Node(2,list.next,list.next.random); 
		 list = new Node(3,list.next.next,list.next.next.random);
		 list = new Node(4,list.next.next.next,list.next.next.next.random);
	  
	        // Setting up random references. 
	        list.random = list.next.next; 
	        list.next.random = 
	            list.next.next.next; 
	        list.next.next.random = 
	            list.next.next.next.next; 
	        list.next.next.next.random = 
	            list.next.next.next.next.next; 
	        list.next.next.next.next.random = 
	            list.next; 
	  
	      
	  
	        // Print the original and cloned linked list. 
	        System.out.println("Original linked list"); 
	        r.print(list); 
	        System.out.println("\nCloned linked list"); 
	       // clone.print(); 

	}

}
