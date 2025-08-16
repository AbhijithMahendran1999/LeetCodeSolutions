package PallindromeLinkedList;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        ListNode copyhead = null;
        while(cur != null){
            copyhead = new ListNode(cur.val, copyhead);
            cur = cur.next;
        }
        cur = head;
        while(cur !=null){
            if(cur.val != copyhead.val)
                return false;
            cur = cur.next;
            copyhead = copyhead.next;
        }
        return true;
    }
}
