package Leetcode;

public class Q82_RemoveDuplicateFromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = dummy.next;

        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                int duplicate = curr.val;

                while (curr != null && curr.val == duplicate) {
                    curr = curr.next;
                }

                prev.next = curr;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode result = deleteDuplicates(head);
        printLinkedList(result);
    }

    public static void printLinkedList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }
}
