
package Leetcode;

public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = new ListNode();
        ListNode mergeHead = mergeList;
        while(list1 != null && list2 != null){
            ListNode temp = new ListNode();
            if(list1.val < list2.val){
                temp.val = list1.val;
                list1 = list1.next;
            }
            else if(list1.val > list2.val){
                temp.val = list2.val;
                list2 = list2.next;
            }
            else{
                ListNode temp1 = new ListNode();
                temp.val = list1.val;
                temp1.val = list2.val;
                mergeHead.next = temp1;
                list1 = list1.next;
                list2 = list2.next;
                mergeHead = mergeHead.next;
            }
            mergeHead.next = temp;
            mergeHead = mergeHead.next;
        }
        while(list1 != null){
            ListNode temp = new ListNode();
            temp.val = list1.val;
            list1 = list1.next;
            mergeHead.next = temp;
            mergeHead = mergeHead.next;
        }
        while(list2 != null){
            ListNode temp = new ListNode();
            temp.val = list2.val;
            list2 = list2.next;
            mergeHead.next = temp;
            mergeHead = mergeHead.next;
        }
        return mergeList.next;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode second1 = new ListNode(2);
        ListNode third1 = new ListNode(4);

        head1.next=second1;
        second1.next=third1;
        third1.next=null;

        ListNode head2 = new ListNode(1);
        ListNode second2 = new ListNode(3);
        ListNode third2 = new ListNode(4);

        head2.next=second2;
        second2.next=third2;
        third2.next=null;

        ListNode merge = mergeTwoLists(head1,head2);
        while (merge!=null) {
            System.out.print(merge.val + " ->");
            merge = merge.next;
        }
    }
}