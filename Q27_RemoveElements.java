package Leetcode;

import java.util.Arrays;

public class Q27_RemoveElements {
    public static int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == val) {
                swap(nums,left,right);
                right--;
            }
            else {
                left++;
            }
        }
        return left;
    }

    public static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int index = removeElement(nums,val);

        System.out.println(Arrays.toString(Arrays.copyOf(nums,index)));
    }
}
