package Leetcode;

public class MergeNodesBetweenZeros {
    public static ListNode mergeNodes(ListNode head) {
        ListNode sum = new ListNode();
        ListNode currNode = sum;
        int currSum = 0;
        while(head.next != null){
            if(head.next.val == 0){
                ListNode temp = new ListNode(currSum);
                currNode.next = temp;
                currNode = currNode.next;
                currSum = 0;
            }
            else{
                currSum += head.next.val;
            }
            head = head.next;
        }
        return sum.next;
    }
}
