package com.interview.practice.linkedlist;

import java.util.HashSet;
import java.util.Set;

import com.interview.practice.linkedlist.PracticeLinkedList.ListNode;

public class LinkedList {
	
	ListNode removeDuplicate(ListNode head){
		Set<Integer> hs = new HashSet<Integer>();
		ListNode temp = head;
		ListNode prev = null;
		
		while(head != null){
		
			if(hs.contains(head.val)){

				prev.next = head.next;
					
			}else {
				hs.add(head.val);
				prev = head;
			}
			head = head.next;
		}
		
		return temp;


	}
	
	ListNode deleteNode(ListNode head,int val) {
		
		ListNode temp = head;
		ListNode prev = null;
		
		if(head  != null && head.val == val ) {
			head = head.next;
			return head;
		}
		
		while(head!=null) {
			if(head.val == val) {
				prev.next=head.next;
			}else {
				prev = head;
			}
			head = head.next;
		}
		
		return temp;
		
	}
	
	public ListNode Kthelement(ListNode head,int k){

		ListNode firstPtr = head;
		ListNode secondPtr = head;
		
	
		
		for(int i=0;i<k;i++){
			if(firstPtr == null) {
				return null;
			}
			firstPtr = firstPtr.next;
		}
		
		while(firstPtr != null)
		{
			secondPtr = secondPtr.next;
			firstPtr = firstPtr.next;
		
		}
		
		return secondPtr;
		

	}
	
	public ListNode deleteMiddleElement(ListNode head){

		ListNode firstPtr = head;
		ListNode secondPtr = head;
		ListNode prev = null;
		ListNode temp = head;
		
		while(firstPtr != null && firstPtr.next != null) {
			firstPtr = firstPtr.next.next;
			if(firstPtr != null) {
			prev =secondPtr;
			secondPtr = secondPtr.next;
			}
			
		}
		
		//delete
		System.out.println(prev.val);
		prev.next = secondPtr.next;
		
		return head;
		

	}
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		ListNode head = PracticeLinkedList.build();
		//ListNode result = l.removeDuplicate(head);
		//ListNode result1 = l.deleteNode(head, 6);
		//ListNode result1 = l.Kthelement(head, 3);
		ListNode result1 = l.deleteMiddleElement(head);
		//PracticeLinkedList.print(result);
	PracticeLinkedList.print(result1);
		//System.out.println(result1);
	}



}
