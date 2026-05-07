package Leetcode;
import Leetcode.ListNode;

public class Q328_OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {

        ListNode evenDummy = new ListNode(0);
        ListNode oddDummy = new ListNode(0);

        ListNode evenTemp = evenDummy;
        ListNode oddTemp = oddDummy;
        ListNode temp = head;
        int position = 1;

        while (temp != null) {
            ListNode newNode = new ListNode(temp.val);
            if (position%2 == 0) {
                evenTemp.next = newNode;
                evenTemp = evenTemp.next;
            }
            else {
                oddTemp.next = newNode;
                oddTemp = oddTemp.next;
            }
            position++;
            temp = temp.next;
        }
        oddTemp.next = evenDummy.next;

        return oddDummy.next;
    }
    public static ListNode oddEvenList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head, even = head.next, evenTemp = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenTemp;

        return head;
    }
    public static void main(String[] args) {
        ListNode head1 = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1,2,3,4,5});
        ListNode result = oddEvenList(head1);
        ListNode result1 = oddEvenList2(head1);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result1);
    }
}
