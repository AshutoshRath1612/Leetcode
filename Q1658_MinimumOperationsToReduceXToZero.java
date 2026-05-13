package Leetcode;

public class Q1658_MinimumOperationsToReduceXToZero {
    public static int minOperations(int[] nums, int x) {
        int target = 0;

        for (int i: nums) {
            target += i;  // 11
        }

        if (target < x) {
            return -1;
        }

        if (target == x) {
            return nums.length;
        }
        int remaining = target - x; // 6
        int sum = 0;

        int left = 0, operations = Integer.MAX_VALUE;
        for (int right =0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > remaining) {
                sum -= nums[left++];
            }

            if (sum == remaining) {
                operations = Math.min(operations, nums.length - (right - left + 1));

            }
        }

        return operations == Integer.MAX_VALUE ? -1 : operations;
    }
    public static void main(String[] args) {
        int [] nums = {3,2,20,1,1,3};
        int x = 10;

        System.out.println(minOperations(nums,x));
    }
}
