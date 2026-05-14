package Leetcode;

import java.util.Arrays;

public class Q2784_CheckIfArrayIsGood {
    public static boolean isGood(int[] nums) {
        Arrays.sort(nums);

        if (nums.length != nums[nums.length-1]+1) {
            return false;
        }

        for (int i = 1;i<nums.length-1;i++){
            if (nums[i] != nums[i-1]+1) {
                return false;
            }
        }

        return nums[nums.length-1] == nums[nums.length-2];
    }
    public static boolean isGood2(int[] nums) {
        int [] frequencies = new int[nums.length-1];

        for (int i: nums) {
            if (i < 1 || i > nums.length-1) {
                return false;
            }
            frequencies[i-1]++;
        }

        for (int i = 0; i < frequencies.length-1; i++) {
            if (frequencies[i] != 1) {
                return false;
            }

        }
        if (frequencies[frequencies.length-1] != 2){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int [] nums = {2,1,3};
        System.out.println(isGood2(nums));
    }
}
