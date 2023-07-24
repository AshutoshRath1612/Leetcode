package Leetcode;

public class RemoveNthNodeFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        if(count==n){
            head = head.next;
            return head;
        }
        count = count-n;
        while(count > 1){
            count--;
            temp = temp.next;
        }
        if(temp==null ||temp.next.next==null)
            temp.next = null;
        else
            temp.next = temp.next.next;
        return head;
    }
    public static void printll(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + "->");
            temp =temp.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        ListNode l1 = new ListNode(2);
//        ListNode l2 = new ListNode(3);
//        ListNode l3 = new ListNode(4);
//        ListNode l4 = new ListNode(5);

//        head.next =l1;
//        l1.next =l2;
//        l2.next = l3;
//        l3.next = l4;

        ListNode newHead = removeNthFromEnd(head,1);
        printll(newHead);
    }
}
