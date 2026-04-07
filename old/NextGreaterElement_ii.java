package Leetcode;

import java.util.Arrays;

/*
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]),
return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array,
which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
 */
public class NextGreaterElement_ii {
    public static int[] nextGreaterElements(int[] nums) {
        int[]arr=new int[nums.length];// 1 2 1
        for (int i=0;i<arr.length;i++){
            int j = i==arr.length-1 ?0 : i+1;
            if(arr.length>1) {
                while (i != j) {
                    if (nums[j] > nums[i]) {
                        arr[i] = nums[j];
                        break;
                    } else
                        arr[i] = -1;
                    if (j == arr.length - 1)
                        j = 0;
                    else
                        j++;

                }
            }
            else
                arr[i]=-1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1};
        int []nums= nextGreaterElements(arr);
        System.out.println(Arrays.toString(nums));
    }
}
