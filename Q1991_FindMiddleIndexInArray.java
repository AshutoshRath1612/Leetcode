package Leetcode;

public class Q1991_FindMiddleIndexInArray {
    public static int findMiddleIndex(int[] nums) {
        int sum = 0;

        for (int i: nums) {
            sum += i;
        }

        int leftSum =0;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (sum == leftSum)
                return i;
            leftSum += nums[i];

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(arr));
    }
}
