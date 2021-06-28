package com.practice.LinkedList;

public class checkCycle {
	 public boolean hasCycle(ListNode head) {
		 
		 ListNode slowPtr;
		 ListNode fastPtr = null;
		
		 
		 
		 slowPtr = head;
		 
		 if(slowPtr.next.next != null) {
			 fastPtr = slowPtr.next.next;
		 }
		 while(slowPtr != null && fastPtr != null) {
			 
			 if(slowPtr == fastPtr) {
				 return true;
			 }
			 
			 fastPtr = fastPtr.next.next;
			 slowPtr = slowPtr.next;
		 }
		 
	      return false;  
	    }

	public static void main(String[] args) {
		
		checkCycle c = new checkCycle();
		ListNode list = new ListNode(0);
        list = new ListNode(85); 
        list.next = new ListNode(15); 
        list.next.next = new ListNode(4); 
        list.next.next.next = list.next.next; 
	
		boolean result = c.hasCycle(list);
		System.out.println("*****"+result);
	}

}
