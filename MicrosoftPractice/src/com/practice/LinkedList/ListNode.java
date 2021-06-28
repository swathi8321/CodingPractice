package com.practice.LinkedList;

public class ListNode {

	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}

	@Override
    public String toString() {
 
        String data = "";
        ListNode current = this;
        do {
            data += current.val + ",";
            current = current.next;
        } while (current != null);
 
        return data;
    }
	
	public ListNode insertIntoListNode(ListNode newList, int[] valArr) {
		ListNode list = new ListNode(0); 
		for (int i = 0; i < valArr.length; i++) {
			list = new ListNode(valArr[i]);
			list = newList.next;
		}
		
		return list;

	}
	
	public  void printLinkedList(ListNode list) {
		int i =0;
		while(list != null) {
			System.out.println(list.val);
			list = list.next;
			i++;
		}
		
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
		
	}
}

