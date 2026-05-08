package Leetcode;
import Leetcode.ListNode;

public class Q24_SwapsNodesInPairs {
    public static ListNode swapPairs(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = prev.next.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1,2,3,4});
        ListNode result = swapPairs(head);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
    }
}
