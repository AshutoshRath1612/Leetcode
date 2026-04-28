package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Q1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];

            if (hm.containsKey(remainder)) {
                return new int[]{i, hm.get(remainder)};
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
