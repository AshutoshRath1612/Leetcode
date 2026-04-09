package Leetcode;

import java.util.Arrays;

/*
Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n
that satisfy the condition nums[i] + nums[j] + nums[k] < target.
 */
public class Q259_3SumSmaller {
    public static int threeSumSmaller(int[] nums, int target) {
        int counter = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++){
            int left = i+1, right = nums.length-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < target) {
                    counter += right - left;
                    left++;
                }

                if (sum >= target) {
                    right--;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int [] arr = {-10, -8, -3, 1, 5};
        int target = -5;

        System.out.println(threeSumSmaller(arr, target));
    }
}
