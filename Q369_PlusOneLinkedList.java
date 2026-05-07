package Leetcode;
import Leetcode.ListNode;

public class Q369_PlusOneLinkedList {
    public static ListNode plusOne(ListNode head) {
        ListNode reverseList = reverseListNode(head);
        ListNode result = new ListNode(-1);
        ListNode resultHead = result;

        ListNode temp = reverseList;
        int carry = 1;

        while (temp != null || carry != 0) {
            int val = temp == null ? 0 : temp.val;

            int sum = val + carry;

            ListNode newNode = new ListNode(sum%10);
            resultHead.next = newNode;
            carry = sum/10;
            resultHead = resultHead.next;

            if (temp != null) {
                temp = temp.next;
            }
        }

        return reverseListNode(result.next);
    }

    public static ListNode reverseListNode(ListNode head) {
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
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1,2,3});
        ListNode result = plusOne(head);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
    }
}
