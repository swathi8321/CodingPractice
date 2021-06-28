package com.practice.LinkedList;

public class mergeTwoLinkedList {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode tempMergeList = new ListNode(0);
		ListNode resultMergeList = tempMergeList;

		while (l1 != null || l2 != null) {

			int l1Val = (l1 != null ? l1.val : Integer.MAX_VALUE);
			int l2Val = (l2 != null ? l2.val :  Integer.MAX_VALUE);

			if (l1Val == l2Val) {
				tempMergeList.next = new ListNode(l1.val);
				tempMergeList = tempMergeList.next;
				tempMergeList.next = new ListNode(l2.val);
				tempMergeList = tempMergeList.next;
				l1 = (l1 == null ? l1 : l1.next);
				l2 = (l2 == null ? l2 : l2.next);

			} else if (l1Val < l2Val) {
				tempMergeList.next = new ListNode(l1Val);
				tempMergeList = tempMergeList.next;
				l1 = (l1 == null ? l1 : l1.next);

			} else if (l1Val > l2Val) {
				tempMergeList.next = new ListNode(l2Val);
				tempMergeList = tempMergeList.next;
				l2 = (l2 == null ? l2 : l2.next);

			}

		}

		return resultMergeList.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
