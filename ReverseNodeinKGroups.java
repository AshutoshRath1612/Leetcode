package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseNodeinKGroups {
    public static ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> nodes = new ArrayList<>();
        ListNode tempHead = head;
        while(tempHead != null){
            nodes.add(tempHead.val);
            tempHead = tempHead.next;
        }
        int index = 0;
        while(index + k <= nodes.size()){
            int backIndex = 0;
            for(int i = index; i < index + k/2 ;i++){
                int temp = nodes.get(i);
                nodes.set(i , nodes.get(index + k - 1 - backIndex));
                nodes.set(index + k - 1- backIndex , temp);
                backIndex++;
            }
            index += k;
        }
        ListNode newHead = new ListNode();
        tempHead = newHead;
        for(int i : nodes){
            ListNode temp = new ListNode(i);
            tempHead.next = temp;
            tempHead = tempHead.next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {

    }
}
