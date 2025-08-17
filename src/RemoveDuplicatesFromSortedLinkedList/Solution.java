package RemoveDuplicatesFromSortedLinkedList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur =head;
        while(cur != null){
            int val = cur.val;
            while(cur.next != null && cur.next.val == val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
