package RemoveLinkedListElements;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null, cur = head;
        while(cur!= null){
            ListNode nxt = cur.next;
            if(cur.val == val){
                if(prev != null)
                    prev.next = nxt;
                else
                    head = head.next;
                cur.next = null;
            }else{
                prev = cur;
            }
            cur = nxt;
        }
        return head;
    }
}