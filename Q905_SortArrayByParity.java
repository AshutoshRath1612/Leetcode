package Leetcode;

import java.util.Arrays;

public class Q905_SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {

            while (left < right && nums[left] % 2 == 0) {
                left++;
            }

            while (right > left && nums[right] % 2 == 1) {
                right--;
            }

            if (left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }
        }

        return nums;
    }

    public static void swap(int [] arr, int i, int j) {
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
}
