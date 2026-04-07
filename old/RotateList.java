package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        List<ListNode> nodes = new ArrayList<>();
        ListNode tempHead = head;
        while(tempHead != null){
            nodes.add(tempHead);
            tempHead = tempHead.next;
        }
        k = k % nodes.size();
        while(k-- > 0){
            nodes.add(0 , nodes.get(nodes.size()-1));
            nodes.remove(nodes.size()-1);
            nodes.get(0).next = nodes.get(1);
            nodes.get(nodes.size() - 1).next = null;
        }
        return head = nodes.get(0);
    }
    public ListNode rotateRight1(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int length = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        tail.next = head;
        int rotateLen = length - k % length;
        for(int i  =0; i < rotateLen ; i++){
            tail = tail.next;
        }
        ListNode newHead = tail.next;
        tail.next = null;
        return newHead;
    }

    public static void main(String[] args) {

    }
}
