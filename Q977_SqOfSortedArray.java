package Leetcode;

import java.util.Arrays;

public class Q977_SqOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int [] arr = new int[nums.length];
        int index = nums.length - 1;
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                arr[index] = nums[right] * nums[right];
                right--;
            }
            else {
                arr[index] = nums[left] * nums[left];
                left++;
            }
            index--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {-4,-1,-0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
