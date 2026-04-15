package Leetcode;

import java.util.Arrays;

public class Q26_RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }

        int i = 0, j = 1;

        while (j < nums.length) {
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }

            if (++i < nums.length && j < nums.length) {
                nums[i] = nums[j];
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int index = removeDuplicates(arr);

        int [] result = Arrays.copyOf(arr, index);

        System.out.println(Arrays.toString(result));
    }
}
