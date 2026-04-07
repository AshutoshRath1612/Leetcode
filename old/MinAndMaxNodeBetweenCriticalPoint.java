package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinAndMaxNodeBetweenCriticalPoint {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null|| head.next.next == null)
            return new int[]{-1,-1};
        List<Integer> al = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        int position = 1;
        while(curr.next!=null){
            if((prev.val > curr.val && curr.val < curr.next.val)||(prev.val < curr.val && curr.val > curr.next.val)){
                al.add(position);
            }
            position++;
            prev = prev.next;
            curr = curr.next;
        }
        if(al.size() <2){
            return new int[]{-1,-1};
        }
        System.out.println(al);
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = al.get(al.size()-1) - al.get(0);
        for(int i=1 ;i < al.size();i++){
            minDistance = Math.min(minDistance , al.get(i) - al.get(i-1));
        }
        return new int[]{minDistance,maxDistance};
    }
    public static void main(String[] args) {

    }
}
