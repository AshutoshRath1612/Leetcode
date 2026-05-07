package Leetcode;
import Leetcode.ListNode;

public class Q2_AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long carry = 0;

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode result = new ListNode(0);
        ListNode resultTemp = result;

        while (temp1 != null || temp2 != null || carry != 0) {
            int val1 = temp1 != null ? temp1.val : 0;
            int val2 = temp2 != null ? temp2.val : 0;

            long sum = val1 + val2 + carry;

            ListNode newNode = new ListNode((int)sum%10);
            resultTemp.next = newNode;
            carry = sum/10;
            resultTemp = resultTemp.next;

            if (temp1 != null)
                temp1 = temp1.next;

            if (temp2 != null)
                temp2 = temp2.next;
        }

        return result.next;
    }
    public static void main(String[] args) {
        ListNode head1 = Q2326_SpiralMatrixIV.makeListNodes(new int[]{2,4,3});
        ListNode head2 = Q2326_SpiralMatrixIV.makeListNodes(new int[]{5,6,4});
        ListNode result = addTwoNumbers(head1,head2);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
    }
}
