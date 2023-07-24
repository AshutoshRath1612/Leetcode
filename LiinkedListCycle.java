package Leetcode;

public class LiinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(-4);

        head.next =l1;
        l1.next =l2;
        l2.next = l3;
        l3.next = l1;
        boolean hascycle = hasCycle(head);
        System.out.println(hascycle);
    }
}
