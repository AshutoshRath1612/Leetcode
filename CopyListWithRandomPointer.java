package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        List<Node> nodeList = new ArrayList<>();
        Node tempHead = head;
        while(tempHead != null){
            nodeList.add(tempHead);
            tempHead = tempHead.next;
        }
        Node nodes = new Node(-1);
        tempHead = nodes;
        for(int i = 0; i < nodeList.size();i++){
            Node newNode = new Node(nodeList.get(i).val);
            tempHead.next = newNode;
            tempHead = tempHead.next;
        }
        tempHead = nodes.next;
        List<Node> newList = new ArrayList<>();
        while(tempHead != null){
            newList.add(tempHead);
            tempHead = tempHead.next;
        }
        for(int i = 0 ; i < newList.size();i++){
            int index = nodeList.indexOf(nodeList.get(i).random);
            if(index == -1){
                newList.get(i).random = null;
            }
            else{
                newList.get(i).random = newList.get(index);
            }
        }
        return nodes.next;
    }
    public Node copyRandomList1(Node head) {
        if(head == null){
            return head;
        }
        HashMap<Node,Node> nodes = new HashMap<>();
        Node tempHead = head;
        while(tempHead != null){
            nodes.put(tempHead , new Node(tempHead.val));
            tempHead = tempHead.next;
        }
        tempHead = head;
        while(tempHead != null){
            nodes.get(tempHead).next = nodes.get(tempHead.next);
            nodes.get(tempHead).random = nodes.get(tempHead.random);
            tempHead = tempHead.next;
        }
        return nodes.get(head);
    }
    public static void main(String[] args) {

    }
}
