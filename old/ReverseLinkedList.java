package Leetcode;


class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
 }
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head==null)
            return head;
        ListNode temp = head;
        ListNode newHead = new ListNode();
        newHead.val = temp.val;
        temp=temp.next;
        while(temp!=null){
            ListNode newNode = new ListNode();
            newNode.val = temp.val;
            newNode.next = newHead;
            newHead = newNode;
            temp = temp.next;
        }
        return newHead;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next =second;
        second.next = third;
        third.next=forth;
        forth.next=fifth;
        fifth.next=null;
        ListNode reverse = reverseList(head);
        while (reverse!=null){
            System.out.print(reverse.val+ " ->");
            reverse = reverse.next;
        }
    }
}
