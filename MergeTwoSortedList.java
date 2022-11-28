
package Leetcode;

public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return list1;
        if(list1==null||list2==null){
            if (list1==null)
                return list2;
            else
                return list1;
        }
        ListNode newList = new ListNode();
        ListNode temp = newList;
        while (list1!=null && list2!=null){
            if (list1.val<list2.val){
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            }
            else if(list1.val>list2.val){
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2=list2.next;
            }
            else{
                temp.next = new ListNode(list1.val);
                temp=temp.next;
                temp.next = new ListNode(list2.val);
                list1=list1.next;
                list2=list2.next;
                temp=temp.next;
            }
        }
        while (list1!=null){
            temp.next = new ListNode(list1.val);
            temp=temp.next;
            list1=list1.next;
        }
        while (list2!=null){
            temp.next = new ListNode(list2.val);
            temp=temp.next;
            list2=list2.next;
        }
        return newList.next;
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