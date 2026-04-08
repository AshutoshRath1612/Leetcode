package Leetcode;

import java.util.Arrays;

public class Q16_3Sum_Closest {
    public static int threeSumClosest(int[] nums, int target) {
        int closest = nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++){
            int j = i+1, k = nums.length-1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }


                if (sum == target) return sum;
                else if (sum < target) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }

        return closest;
    }
    public static void main(String[] args) {
        int [] arr = {13, -5, 7, 2, -8, 4, 0, 11, -3, 6, 9, -2};
        int target = 10;
        System.out.println(threeSumClosest(arr, target));
    }
}
