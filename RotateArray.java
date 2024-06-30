package Leetcode;

import java.util.Arrays;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        rotateArray(nums,0,nums.length-1);
        if(nums.length < k){
            rotateArray(nums, 0,(k-nums.length-1)%nums.length);
            rotateArray(nums,k-nums.length,nums.length-1);
            return;
        }
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,nums.length-1);
    }
    public static void rotateArray(int [] arr,int s , int e){
        while(s < e){
            int temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
    public static void main(String[] args) {
        int []arr ={1,2,3};
        int k=5;
        rotate(arr,k);
        System.out.println( Arrays.toString(arr));
    }
}
