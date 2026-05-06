package Leetcode;
import Leetcode.ListNode;

public class Q160_IntersectionOfLinkedList {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        int n1 = 0, n2 = 0;

        ListNode temp = headA;

        while (temp != null) {
            temp = temp.next;
            n1++;
        }

        temp = headB;

        while (temp != null) {
            temp = temp.next;
            n2++;
        }

        ListNode head1 = headA, head2 = headB;
        while (n1 > n2) {
            head1 = head1.next;
            n1--;
        }

        while (n2 > n1) {
            head2 = head2.next;
            n2--;
        }

        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode head1 = headA;
        ListNode head2 = headB;

        while (head1 != head2) {
            head1 = head1 == null ? headB : head1.next;
            head2 = head2 == null ? headA : head2.next;
        }

        return head1;
    }
    public static void main(String[] args) {
        ListNode head1 = Q2326_SpiralMatrixIV.makeListNodes(new int[]{4,1});
        ListNode head2 = Q2326_SpiralMatrixIV.makeListNodes(new int[]{5,6,1});
        ListNode head3 = Q2326_SpiralMatrixIV.makeListNodes(new int[]{8,4,5});

        ListNode temp = head1;
        while (temp.next!= null) {
            temp = temp.next;
        }
        temp.next = head3;
        temp = head2;
        while (temp.next!= null) {
            temp = temp.next;
        }
        temp.next = head3;
        ListNode result = getIntersectionNode2(head1,head2);
        System.out.println(result.val);
    }
}
