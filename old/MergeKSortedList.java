package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public ListNode mergeKLists2(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        for(ListNode node : lists){
            ListNode temp = node;
            while(temp != null){
                list.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(list);
        ListNode sorted = new ListNode();
        ListNode curr = sorted;
        for(int i : list){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return sorted.next;
    }

    public static void main(String[] args) {

    }
}
