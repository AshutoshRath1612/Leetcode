package Leetcode;

import java.util.Arrays;

public class Q189_RotateArray {
    public static void rotate(int[] nums, int k) {
        swap(nums, 0, nums.length-1);
        swap(nums, 0, k%nums.length-1);
        swap(nums, k%nums.length, nums.length-1);
    }
    public static void swap(int [] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
