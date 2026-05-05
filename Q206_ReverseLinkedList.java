package Leetcode;
import Leetcode.ListNode;
public class Q206_ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode next = head;
        while (next != null) {
            ListNode nextNode = next.next;
            next.next = prev;
            prev = next;
            next = nextNode;
        }

        return prev;
    }
    public static void main(String[] args) {
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1,2,3,4,5});
        ListNode result = reverseList(head);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
    }
}
