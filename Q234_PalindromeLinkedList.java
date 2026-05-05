package Leetcode;
import Leetcode.ListNode;

public class Q234_PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode newNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = newNode;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = prev;

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return firstHalf == null || firstHalf.next == null;
    }
    public static void main(String[] args) {
        ListNode head = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1,2});
        System.out.println(isPalindrome(head));
    }
}
