package Leetcode;

public class IntersectionOfTwoLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int alength=0;
        int blength=0;
        ListNode atemp = headA;
        ListNode btemp = headB;
        while(atemp!=null){
            alength++;
            atemp = atemp.next;
        }
        while(btemp!=null){
            blength++;
            btemp = btemp.next;
        }
        while(alength>blength){
            alength--;
            headA = headA.next;
        }
        while(blength>alength){
            blength--;
            headB = headB.next;
        }
        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    public static void main(String[] args) {

    }
}