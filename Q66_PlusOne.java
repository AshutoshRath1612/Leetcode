package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q66_PlusOne {
    public static int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int i = digits.length - 1, carry = 1;

        while (i >= 0 || carry != 0) {

            if (i >= 0)
                carry += digits[i];

            result.addFirst(carry%10);
            carry = carry/10;
            i--;
        }

        return result.stream().mapToInt(j -> j).toArray();
    }
    public static void main(String[] args) {
        int [] nums = {9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
