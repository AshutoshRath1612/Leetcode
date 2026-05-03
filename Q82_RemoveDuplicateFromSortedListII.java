package Leetcode;

public class Q82_RemoveDuplicateFromSortedListII {
    public static Leetcode.ListNode deleteDuplicates(Leetcode.ListNode head) {
        Leetcode.ListNode dummy = new Leetcode.ListNode(-1);
        dummy.next = head;

        Leetcode.ListNode prev = dummy;
        Leetcode.ListNode curr = dummy.next;

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
        Leetcode.ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1, 2, 3, 3, 4, 4, 5});
        Leetcode.ListNode result = deleteDuplicates(head);
        printLinkedList(result);
    }

    public static void printLinkedList(Leetcode.ListNode head) {
        Leetcode.ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }
}
