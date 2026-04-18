package Leetcode;

import java.util.Arrays;

public class Q1929_ConcatanationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int [] result = new int[nums.length*2];

        for (int i=0; i<nums.length; i++) {
            result[i] = nums[i];
            result[nums.length + i] = nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}
