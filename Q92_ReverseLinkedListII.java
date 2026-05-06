package Leetcode;
import Leetcode.ListNode;

public class Q92_ReverseLinkedListII {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        for (int i = left; i < right && curr!= null; i++) {
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
            Q82_RemoveDuplicateFromSortedListII.printLinkedList(dummy.next);
            System.out.println();
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1,2,3,4,5});
        ListNode result = reverseBetween(head, 2, 4);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
    }
}
