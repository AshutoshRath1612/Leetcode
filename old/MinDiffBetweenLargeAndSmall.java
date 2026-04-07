package Leetcode;

import java.util.Arrays;

public class MinDiffBetweenLargeAndSmall {
    public static int minDifference(int[] nums) {
        if(nums.length <=4)
            return 0;
        Arrays.sort(nums);
        int maxDiff = Integer.MAX_VALUE;
        for(int left = 0 , right = nums.length - 4;left <= 3;left++,right++ ){
            maxDiff = Math.min(maxDiff , nums[right] - nums[left]);
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int [] arr = {0,5,1,10,14};
        System.out.println(minDifference(arr));
    }
}
