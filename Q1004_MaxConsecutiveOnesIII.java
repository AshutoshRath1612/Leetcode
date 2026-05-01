package Leetcode;

public class Q1004_MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int maxOne = 0, leftIndex = 0;
        int noOfZeros = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                noOfZeros++;
            }
            if (noOfZeros > k && nums[leftIndex++] == 0) {
                noOfZeros--;
            }
            maxOne = Math.max(maxOne, i - leftIndex + 1);
        }

        return maxOne;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }
}
