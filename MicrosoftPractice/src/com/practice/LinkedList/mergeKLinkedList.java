package com.practice.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class mergeKLinkedList {

	public ListNode mergeKLists(ListNode[] lists) {

		ListNode tempMergeKList = new ListNode(Integer.MIN_VALUE);

		for (int i = 0; i < lists.length; i++) {

			ListNode result = merge2Lists(tempMergeKList, lists[i]);
			tempMergeKList = result;
		}

		return tempMergeKList.next;

	}

	public ListNode merge2Lists(ListNode l1, ListNode l2) {

		ListNode tempMergeKList = new ListNode(0);
		ListNode resultMergeKList = tempMergeKList;

		while (l1 != null || l2 != null) {

			int l1Val = (l1 == null ? Integer.MAX_VALUE : l1.val);
			int l2Val = (l2 == null ? Integer.MAX_VALUE : l2.val);
//			System.out.println("l1Val "+l1Val);
//			System.out.println("l2Val "+l2Val);
//			System.out.println("*************");
			if (l1Val == l2Val) {

				tempMergeKList.next = new ListNode(l1Val);
				tempMergeKList = tempMergeKList.next;

				tempMergeKList.next = new ListNode(l2Val);
				tempMergeKList = tempMergeKList.next;

				l1 = (l1 == null ? l1 : l1.next);
				l2 = (l2 == null ? l2 : l2.next);

			} else if (l1Val < l2Val) {
				
				tempMergeKList.next = new ListNode(l1Val);
				tempMergeKList = tempMergeKList.next;
				l1 = (l1 == null ? l1 : l1.next);

			} else if (l1Val > l2Val) {
				
				tempMergeKList.next = new ListNode(l2Val);
				tempMergeKList = tempMergeKList.next;
				l2 = (l2 == null ? l2 : l2.next);

			}

		}

		return resultMergeKList.next;

	}

	public static void main(String[] args) {
			
		mergeKLinkedList m = new mergeKLinkedList();
		
		 ListNode list = new ListNode(-2); 
		 ListNode list1 = null; 
		 ListNode list2 = new ListNode(1); 

		 ListNode[] finalList = {list,list1,list2};
		
		 
		 ListNode result = m.mergeKLists(finalList);
			ListNode n = new ListNode(0);
			n.printLinkedList(result);

	}

}
