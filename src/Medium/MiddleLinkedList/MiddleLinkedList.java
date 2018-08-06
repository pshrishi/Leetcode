package MiddleLinkedList;
public class MiddleLinkedList {
	public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        int count = 0;
        while(fast.next != null) {
        	count++;
        	if (count % 2 == 0)
        		slow = slow.next;
        	
        	fast = fast.next;
        }
        
        if (count % 2 != 0)
        	return slow.next;
        else
        	return slow;
    }
}