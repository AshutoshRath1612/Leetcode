package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q989_AddToArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int index = num.length - 1, carry = 0;

        while (index >= 0 || carry != 0|| k > 0) {
            if (index >= 0) {
                carry += num[index];
            }
            if (k > 0) {
                carry += k%10;
                k = k/10;
            }
            result.addFirst(carry%10);
            carry = carry/10;
            index--;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(nums,k));
    }
}
