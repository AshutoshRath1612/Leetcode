package Leetcode;

import java.util.ArrayList;

class Solution {
    ArrayList<Integer> al = new ArrayList<>();
    public Solution(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            al.add(temp.val);
            temp = temp.next;
        }
    }

    public int getRandom() {
        return  al.get((int)(Math.random()*al.size()));
    }
}
public class LinkedListRandomNode {
    public static void main(String[] args) {

    }
}
