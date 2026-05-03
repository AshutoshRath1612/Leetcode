package Leetcode;

public class Q21_MergeTwoSortedLists {
    public static Leetcode.ListNode mergeTwoLists(Leetcode.ListNode list1, Leetcode.ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        Leetcode.ListNode dummy = new Leetcode.ListNode(0);
        Leetcode.ListNode result = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummy.next = new Leetcode.ListNode(list1.val);
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                dummy.next = new Leetcode.ListNode(list2.val);
                list2 = list2.next;
            } else {
                dummy.next = new Leetcode.ListNode(list1.val);
                dummy = dummy.next;
                dummy.next = new Leetcode.ListNode(list2.val);
                list1 = list1.next;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }
        while (list1 != null) {
            dummy.next = new Leetcode.ListNode(list1.val);
            list1 = list1.next;
            dummy = dummy.next;
        }
        while (list2 != null) {
            dummy.next = new Leetcode.ListNode(list2.val);
            list2 = list2.next;
            dummy = dummy.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        Leetcode.ListNode head1 = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1, 2, 4});
        Leetcode.ListNode head2 = Q2326_SpiralMatrixIV.makeListNodes(new int[]{1, 3, 4});

        Leetcode.ListNode result = mergeTwoLists(head1, head2);
        Q82_RemoveDuplicateFromSortedListII.printLinkedList(result);
    }
}
