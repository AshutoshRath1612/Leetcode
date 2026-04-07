package Leetcode;

import java.util.Arrays;

public class MaxProductOfTwoElement {
    public static int maxProduct(int[] nums) {
        sort(nums,0, nums.length-1);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
    public static void sort(int []arr,int s,int e){
        int i =s;
        int j=e;
        if (i>=j){
            return;
        }
        int mid = i + (j-i)/2;
        while(i<=j){
            while (arr[i]<arr[mid])
                i++;
            while (arr[j]>arr[mid])
                j--;
            if (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        sort(arr,s,j);
        sort(arr,i,e);
    }
    public static void main(String[] args) {
        int[]arr = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }
}
