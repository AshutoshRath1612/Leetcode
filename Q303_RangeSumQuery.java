package Leetcode;

import java.util.Arrays;

class NumArray {
    int [] num;
    int [] prefixSum;
    public NumArray(int[] nums) {
        num = nums;
        prefixSum = new int[nums.length+1];

        for (int i =0; i < nums.length; i++) {
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right+1] - prefixSum[left];
    }
}

public class Q303_RangeSumQuery {
    public static void main(String[] args) {
        NumArray na = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        System.out.println(na.sumRange(0,2));
        System.out.println(na.sumRange(2,5));
        System.out.println(na.sumRange(0,5));
    }
}
