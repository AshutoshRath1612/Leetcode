package Leetcode;

import java.util.Arrays;

public class Q1470_ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int [] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length/2; i++) {
            result[index++] = nums[i];
            result[index++] = nums[n+i];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr,4)));
    }
}
