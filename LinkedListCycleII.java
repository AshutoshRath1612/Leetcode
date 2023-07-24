package Leetcode;

//class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//         next = null;
//      }
//  }
public class LinkedListCycleII {
    public static ListNode detectCycle(ListNode head) {
        ListNode pointer = head;
        ListNode fpointer = head;
        while(fpointer!=null && fpointer.next!=null){
            pointer = pointer.next;
            fpointer = fpointer.next.next;
            if(pointer==fpointer){
                pointer=head;
                while(pointer!=fpointer){
                    pointer = pointer.next;
                    fpointer = fpointer.next;
                }
                return pointer;
            }
        }
        return null;
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
        ListNode pos = detectCycle(head);
        System.out.println(pos.val);
    }
}
