package Leetcode;
import Leetcode.ListNode;

public class Q83_RemoveDuplicateFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                int duplicate = curr.val;
                ListNode temp = curr;

                while (temp != null && temp.val == duplicate) {
                    temp = temp.next;
                }

                curr.next = temp;
            }
            else {
                curr = curr.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1,1,2,3,3});
        ListNode result = deleteDuplicates(head);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
    }
}
