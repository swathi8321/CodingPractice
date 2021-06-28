package com.interview.practice.linkedlist;



public class PracticeLinkedList {

	static ListNode head;
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	
	 public void deleteNode(ListNode node) {
		    
	        if(node == null || node.next == null){
	            return;
	        }
	        node.val = node.next.val;
	        node.next = node.next.next;
	        
	       
	        
	    }
	 
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        
         ListNode start = new ListNode(0);
        
        ListNode fastPtr = start;
         ListNode slowPtr = start;
        
      slowPtr.next = head;
        
        for(int i=0;i<=n;i++){
            fastPtr = fastPtr.next;
        }
        
       
        
        while(fastPtr != null){
            
             fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
            
        }
        
      
        slowPtr.next = slowPtr.next.next;
        
        return start.next;
        
    }
	 
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
	        ListNode tempMergeList = new ListNode(0);
			ListNode resultMergeList = tempMergeList;

			while (l1 != null || l2 != null) {

				int l1Val = (l1 != null ? l1.val : 2345);
				int l2Val = (l2 != null ? l2.val : 2345);

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
	 
	 public boolean isPalindrome(ListNode head) {
	        
         
	        ListNode fast = head, slow = head;
	      
	         if (head == null || head.next == null) return true;
	       
	        
	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	            
	        }      
	       
	        slow = reverse(slow);
	        fast = head;
	        
	        while(slow!=null ){
	            
	            
	            if(slow.val != fast.val){
	                return false;
	            }
	            fast = fast.next;
	            slow = slow.next;
	        }
	        
	        return true;
	        
	    }
	 public ListNode reverse(ListNode oldNode){
	        
	        ListNode temp;
	        ListNode newNode = null;    
	        
	     
	        while(oldNode != null){
	            temp = oldNode.next;
	            
	            oldNode.next = newNode;
	            newNode = oldNode;
	            
	            
	            oldNode = temp;
	            
	        }
	        
	        return newNode;
	        
	    }
	 
	 public boolean hasCycle(ListNode head) {
	        
	        ListNode slowPtr = head;
	        ListNode fastPtr = null;
	        
	        if((slowPtr != null) && (slowPtr.next != null) && (slowPtr.next.next != null)){
	            
	            fastPtr = slowPtr.next.next;
	        }
	        
	        while(slowPtr != null && fastPtr != null){
	            
	            if(slowPtr == fastPtr){
	                return true;
	            }
	            
	            slowPtr = slowPtr.next;
	            
	            if(fastPtr.next != null){
	            fastPtr = fastPtr.next.next;
	            }else{
	                fastPtr = null;
	            }
	        }
	        
	        return false;
	    }
	public ListNode reverseLinkedList(ListNode head)
	{
		if(head == null)
		{
			return head;
		}
		ListNode temp = new ListNode(0);
		ListNode newNode = null;
		
		while(head != null)
		{
			temp = head.next;
		
			head.next = newNode;
			newNode = head;
			
			head = temp;
		}
		 return newNode;
	}
	
	public static void print(ListNode temp) {
		while(temp != null)
		{
			System.out.println("***"+temp.val);
			temp = temp.next;
		}
	}

	public static ListNode build() {
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next= new ListNode(5);
		head.next.next.next.next.next= new ListNode(6);
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeLinkedList p = new PracticeLinkedList();
	
		
		ListNode temp = build();
		print(temp);
		
		ListNode reverse =	p.reverseLinkedList(build());
		while(reverse != null)
		{
			System.out.println(reverse.val);
			reverse = reverse.next;
		}
		
		

	}

}