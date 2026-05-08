package Leetcode;
import Leetcode.ListNode;
public class Q86_PartitionList {
    public static ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);
        ListNode temp = head;
        ListNode lessTemp = less;
        ListNode greaterTemp = greater;

        while (temp != null) {
            ListNode currNode = new ListNode(temp.val);

            if (temp.val < x) {
                lessTemp.next = currNode;
                lessTemp = lessTemp.next;
            }
            else {
                greaterTemp.next = currNode;
                greaterTemp = greaterTemp.next;
            }
            temp = temp.next;
        }
        lessTemp.next = greater.next;

        return less.next;
    }
    public static void main(String[] args) {
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1,4,3,2,5,2});
        ListNode result = partition(head, 3);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
    }
}
