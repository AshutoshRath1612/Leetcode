package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKSortedList {
    public static ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> al = new ArrayList<>();
        if (lists.length ==0)
            return null;
        for(int i =0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                al.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(al);
        ListNode sorted = null;
        if(al.size()>0){
            ListNode p = new ListNode(al.get(0));
            sorted =p;
            for(int i =1;i<al.size();i++){
                ListNode newNode = new ListNode(al.get(i));
                p.next = newNode;
                p = newNode;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {

    }
}
