import PallindromeLinkedList.ListNode;
import PallindromeLinkedList.Solution;

public class Main {
    public static void main(String[] args) {
        ListNode n3 = new ListNode(1, null);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(2, n2);
        ListNode head = new ListNode(2, n1);

        System.out.println(new Solution().isPalindrome(head)); // true
    }
}