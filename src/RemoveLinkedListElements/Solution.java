package RemoveLinkedListElements;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(0,head), dummy;
        dummy = ans;
        while(dummy!= null){
            while(dummy.next !=null && dummy.next.val ==val)
                dummy.next = dummy.next.next;
            dummy = dummy.next;
        }
        return ans.next;
    }
}