package Leetcode;

public class MiddleOFLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        count = count/2 +1;
        while(count>1){
            count--;
            head = head.next;
        }
        return head;
    }
    public static void main(String[] args) {

    }
}
