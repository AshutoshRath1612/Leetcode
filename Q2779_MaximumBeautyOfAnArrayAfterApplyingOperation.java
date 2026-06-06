package Leetcode;

import java.util.Arrays;

public class Q2779_MaximumBeautyOfAnArrayAfterApplyingOperation {
    public static int maximumBeauty(int[] nums, int k) {
        int max = 0, left = 0;
        Arrays.sort(nums);

        for (int right = 0; right < nums.length; right++) {

            while (left <= right && Math.abs(nums[right] - nums[left]) > 2 * k) {
                left++;
            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
    public static void main(String[] args) {
        int [] arr = {4,6,1,2};
        int k = 2;
        System.out.println(maximumBeauty(arr, k));
    }
}
