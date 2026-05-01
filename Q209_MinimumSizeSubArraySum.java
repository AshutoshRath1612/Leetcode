package Leetcode;

import java.util.Arrays;

public class Q209_MinimumSizeSubArraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int[] prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = nums[i] + prefixSum[i];
        }
        System.out.println(Arrays.toString(prefixSum));

        int leftIndex = 0, rightIndex = 0;
        while (rightIndex < prefixSum.length) {
            while (rightIndex < prefixSum.length && prefixSum[rightIndex] - prefixSum[leftIndex] < target) {
                rightIndex++;
            }

            while (rightIndex < prefixSum.length && prefixSum[rightIndex] - prefixSum[leftIndex] >= target) {
                minLength = Math.min(minLength, rightIndex - leftIndex);
                leftIndex++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static int minSubArrayLen2(int target, int[] nums) {
        int sum = 0;
        int leftIndex = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                minLength = Math.min(minLength, i - leftIndex + 1);
                sum -= nums[leftIndex++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 11;
        System.out.println(minSubArrayLen(target, arr));
        System.out.println(minSubArrayLen2(target, arr));
    }
}
