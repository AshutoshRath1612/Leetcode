package Leetcode;
import Leetcode.ListNode;

public class Q25_ReverseNodesInKGroups {
    public static ListNode reverseKGroup(ListNode head, int k) {
        int n =0;
        ListNode temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        temp = dummy;

        while (n>=k) {

            ListNode curr = temp.next;
            for (int i =1; i<k;i++) {
                ListNode nextNode = curr.next;
                curr.next = nextNode.next;
                nextNode.next = temp.next;
                temp.next = nextNode;
                Q82_RemoveDuplicateFromSortedListII.printLinkedList(dummy);
                System.out.println();
            }
            n-=k;
            temp = curr;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1,2,3,4,5});
        ListNode result = reverseKGroup(head,3);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
    }
}
