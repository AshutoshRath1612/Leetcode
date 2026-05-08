package Leetcode;
import Leetcode.ListNode;

public class Q61_RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        int n = 0;

        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            n++;
        }
        if (k == 0 || n == 0) {
            return head;
        }
        ListNode reverseList = reverseList(head);
        ListNode dummy = new ListNode(0);
        dummy.next = reverseList;

        temp = dummy;
        for (int i=0;i < k%n; i++) {
            temp = temp.next;
        }
        ListNode nextSeries = temp.next;
        temp.next = null;
        ListNode reverseFirstHalf = reverseList(dummy.next);
        ListNode reverseSecondHalf = reverseList(nextSeries);

        temp = reverseFirstHalf;

        if (reverseFirstHalf == null)
            return reverseSecondHalf;
        if (reverseSecondHalf == null)
            return reverseFirstHalf;

        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        temp.next = reverseSecondHalf;
        return reverseFirstHalf;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1});
        ListNode result = rotateRight(head,1);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
    }
}
