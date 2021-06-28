package com.practice.LinkedList;



public class ReverseLinkedList {
	
	public ListNode reverseList(ListNode head) {
		
		ListNode temp = null;
		ListNode reverseList = null;

		ListNode list;
		list = head;

		while (list != null) {

			temp = list.next;
			list.next = reverseList;

			reverseList = list;

			list = temp;

		}

		return reverseList;

	}	
	
public static void main(String args[]) {
		
		ListNode n = new ListNode(0);
		
		int[] arr = {1,2,4,5,6,7,8};
		
		ListNode list = new ListNode(0);
	        list = new ListNode(85); 
	        list.next = new ListNode(15); 
	        list.next.next = new ListNode(4); 
	        list.next.next.next = new ListNode(20); 
		
	       
		n.printLinkedList(list);
		System.out.print("***********************");
		ReverseLinkedList r = new ReverseLinkedList();
		ListNode reverse = new ListNode(0);
		reverse = r.reverseList(null);
		n.printLinkedList(reverse);
		
		
	}

}
