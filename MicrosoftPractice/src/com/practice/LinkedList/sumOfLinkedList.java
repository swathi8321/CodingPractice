package com.practice.LinkedList;

public class sumOfLinkedList {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode sumNode = new ListNode(0);
		ListNode sumNodetemp = sumNode;

		ListNode reverseNode1 = reverseNode(l1);
		ListNode reverseNode2 = reverseNode(l2);

		int carry = 0;

		while (reverseNode1 != null || reverseNode2 != null) {

			int sum = carry
					+ ((reverseNode1 != null ? reverseNode1.val : 0) + (reverseNode2 != null ? reverseNode2.val : 0));
			;

			carry = sum / 10;
			sum = sum % 10;

			sumNodetemp.next = new ListNode(sum);
			sumNodetemp = sumNodetemp.next;

			reverseNode1 = (reverseNode1 == null ? reverseNode1 : reverseNode1.next);
			reverseNode2 = (reverseNode2 == null ? reverseNode2 : reverseNode2.next);

		}

		if (carry > 0) {
			sumNodetemp.next = new ListNode(carry);
			sumNodetemp = sumNodetemp.next;
		}

		ListNode reverseSumNode = reverseNode(sumNode.next);
		return reverseSumNode;
	}

	public ListNode reverseNode(ListNode head) {
		ListNode temp, list, reverseList;

		temp = null;
		reverseList = null;

		list = head;

		while (list != null) {
			temp = list.next;
			list.next = reverseList;

			reverseList = list;

			list = temp;

		}

		return reverseList;
	}

	public static void main(String[] args) {

		ListNode list = new ListNode(5);
		list.next = new ListNode(6);
		list.next.next = new ListNode(3);
		// list.next.next.next = new ListNode(2);

		ListNode list2 = new ListNode(2);
		list2.next = new ListNode(1);
		list2.next.next = new ListNode(2);
		// list2.next.next.next = new ListNode(2);
		// list2.next.next.next.next = new ListNode(3);

		sumOfLinkedList add = new sumOfLinkedList();
		ListNode sun = add.addTwoNumbers(list, list2);

		ListNode n = new ListNode(0);
		n.printLinkedList(sun);

	}

}
