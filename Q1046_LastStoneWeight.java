package Leetcode;

import java.util.*;

public class Q1046_LastStoneWeight {
    public static int lastStoneWeight1(int[] stones) {
        Deque<Integer> dq = new ArrayDeque<>();
        Stack<Integer> stk = new Stack<>();

        for (int i: stones) {
            while (!dq.isEmpty() && dq.peekLast() < i) {
                stk.push(dq.pollLast());
            }
            dq.offerLast(i);

            while (!stk.isEmpty()) {
                dq.offerLast(stk.pop());
            }
        }
        System.out.println(dq);

        while (dq.size() > 1) {
            int a = dq.pollFirst();
            int b = dq.pollFirst();
            int smash = a - b;

            while (smash != 0 && !dq.isEmpty() && dq.peekLast() < smash) {
                stk.push(dq.pollLast());
            }
            dq.offerLast(smash);
            while (!stk.isEmpty()) {
                dq.offerLast(stk.pop());
            }
        }

        return dq.isEmpty() ? 0 : dq.peekFirst();
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i: stones) {
            pq.add(i);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            int result = Math.abs(a- b);

            if (result != 0) {
                pq.add(result);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
    public static void main(String[] args) {
        int [] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
