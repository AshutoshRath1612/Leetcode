package Leetcode;

import java.util.Stack;

class MyQueue {
    Stack<Integer>stk1 = new Stack<>();
    Stack<Integer>stk2 = new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {
        while (!stk1.isEmpty()){
            stk2.push(stk1.pop());
        }
        stk1.push(x);
        while (!stk2.isEmpty())
            stk1.push(stk2.pop());
    }

    public int pop() {
        if (stk1.isEmpty())
            return -1;
        return stk1.pop();
    }

    public int peek() {
        if (stk1.isEmpty())
            return -1;
        return stk1.peek();
    }

    public boolean empty() {
        return stk1.isEmpty();
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(40);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }
}
