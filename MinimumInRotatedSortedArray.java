package Leetcode;

public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        if (nums[0]<nums[nums.length-1])
            return nums[0];
        return findMinElement(nums , 0 , nums.length-1);
    }
    public static int findMinElement(int[]arr , int s , int e){
        int mid = s +(e-s)/2;
        if (s<e){
            if (mid < e &&arr[mid]> arr[mid+1])
                return arr[mid+1];
            if (mid > s && arr[mid]<arr[mid-1])
                return arr[mid];
            if(arr[mid]>arr[s])
                return findMinElement(arr , mid+1 , e);
            else
                return findMinElement(arr , s , mid-1);
        }
        return arr[mid];
    }
    public static void main(String[] args) {
        int []arr={2,3,4,5,1};
        System.out.println(findMin(arr));
    }
}
