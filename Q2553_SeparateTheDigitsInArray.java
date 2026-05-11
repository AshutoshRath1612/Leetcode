package Leetcode;

import java.util.Arrays;

public class Q2553_SeparateTheDigitsInArray {
    public static int[] separateDigits(int[] nums) {
        int totalDigits = 0;

        for (int i: nums) {
            int num = i;

            while (num > 0) {
                totalDigits++;
                num /= 10;
            }
        }

        int [] result = new int[totalDigits];
        int index = totalDigits-1;
        for (int i =nums.length-1; i >= 0; i--) {
            int num = nums[i];

            while (num > 0) {
                result[index--] = num%10;
                num = num/10;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(arr)));
    }
}
