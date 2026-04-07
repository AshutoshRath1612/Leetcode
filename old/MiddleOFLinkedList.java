package Leetcode;

import java.util.ArrayList;

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
    public static ListNode middleNode1(ListNode head) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            nodes.add(temp);
            temp = temp.next;
        }
        return nodes.get(nodes.size()/2);
    }
    public static void main(String[] args) {

    }
}
