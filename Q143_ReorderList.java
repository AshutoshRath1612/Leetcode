package Leetcode;
import Leetcode.ListNode;

public class Q143_ReorderList {
    public static void reorderList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHalf = reverseListNodes(slow.next);
        slow.next = null;
        ListNode firstHalf = head;
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(secondHalf);
        System.out.println();
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(firstHalf);

        while (firstHalf != secondHalf && firstHalf!= null && secondHalf != null) {
            ListNode secondHalfNextNodes = secondHalf.next;
            ListNode firstHalfNextNodes = firstHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = firstHalfNextNodes;
            secondHalf = secondHalfNextNodes;
            firstHalf = firstHalfNextNodes;
        }

        System.out.println();
    }
    public static ListNode reverseListNodes(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
    public static void main(String[] args) {
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1,2,3,4});
        reorderList(head);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(head);
    }
}
