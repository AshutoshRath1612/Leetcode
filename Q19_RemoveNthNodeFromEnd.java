package Leetcode;

import Leetcode.ListNode;

public class Q19_RemoveNthNodeFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while (n-- >= 0) {
            if (fast != null)
                fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);

        head.next = null;
        l1.next = null;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;

        ListNode result = removeNthFromEnd(head,1);

        while(result != null){
            System.out.print(result.val + "->");
            result = result.next;
        }
    }
}
