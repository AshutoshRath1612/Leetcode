package Leetcode;

import java.util.Arrays;

public class Q3254_FindPowerOfKSizeSubarraysI {
    public static int[] resultsArray(int[] nums, int k) {
        int [] answer = new int[nums.length-k+1];

        for(int i =0; i < answer.length; i++) {
            int maxElement = nums[i];

            for(int j = i+1; j < i+k; j++) {
                if (nums[j]-1 != nums[j-1]) {
                    maxElement = -1;
                    break;
                }
                if (nums[j] > maxElement) {
                    maxElement = nums[j];
                }
            }

            answer[i] = maxElement;
        }
        return answer;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,3,2,5};
        int k = 3;
        System.out.println(Arrays.toString(resultsArray(nums, k)));
    }
}
