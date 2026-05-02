package Leetcode;

import java.util.Arrays;

public class Q1838_FrequencyOfMostFrequentElement {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int leftIndex = 0, maxFrequency = 0;
        long sum = 0;
        for (int rightIndex = 0; rightIndex < nums.length; rightIndex++) {
            sum += nums[rightIndex];

            if ((long) nums[rightIndex] * (rightIndex - leftIndex + 1) - sum > k) {
                sum -= nums[leftIndex++];
            }
            maxFrequency = Math.max(maxFrequency, rightIndex - leftIndex + 1);
        }
        return maxFrequency;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 8, 13};
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }
}
