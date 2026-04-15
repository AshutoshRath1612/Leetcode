package Leetcode;

import java.util.Arrays;

public class Q80_RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int i = 1;

        if (nums.length <= 1) {
            return nums.length;
        }

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i-1]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,1,2,3,3};

        System.out.println(Arrays.toString(Arrays.copyOf(arr, removeDuplicates(arr))));
    }
}
