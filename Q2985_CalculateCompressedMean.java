package Leetcode;

import java.util.Stack;

public class Q2985_CalculateCompressedMean {
    public static double calculateCompressedMean(int[] quantities) {
        Stack<Integer> stk = new Stack<>();

        for (int num : quantities) {

            if (!stk.isEmpty() && stk.peek() == num) {
                stk.pop();
            } else {
                stk.push(num);
            }
        }

        double sum = 0;
        int n = stk.size();

        while (!stk.isEmpty()) {
            sum += stk.pop();
        }

        return sum / n;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,1};
        System.out.println(calculateCompressedMean(arr));
    }
}
