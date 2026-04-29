package Leetcode;

import java.util.HashMap;

public class Q219_ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            if(freq.containsKey(nums[i]) && Math.abs(i - freq.get(nums[i])) <= k) {
                return true;
            }
            freq.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
