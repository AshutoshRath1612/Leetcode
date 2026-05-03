package Leetcode;

import java.util.Arrays;

public class Q41_FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int index = nums[i] - 1;
            if (index < nums.length && index >= 0 && nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2};
        System.out.println(firstMissingPositive(nums));
    }
}
