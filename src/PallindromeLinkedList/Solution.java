package PallindromeLinkedList;

public class Solution {
    public boolean isPalindrome(ListNode head) {
    	ListNode fast = head;
    	ListNode slow = head;
    	while(fast != null && fast.next !=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	ListNode prev = null , cur = slow;
    	while(cur != null) {
    		ListNode nxt = cur.next;
    		cur.next = prev;
    		prev = cur;
    		cur = nxt;
    	}
    	while(prev != null) {
    		if(prev.val != head.val)
    			return false;
    		prev = prev.next;
    		head = head.next;
    	}
    	return true;
    }
}
