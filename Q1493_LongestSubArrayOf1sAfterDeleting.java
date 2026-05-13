package Leetcode;

public class Q1493_LongestSubArrayOf1sAfterDeleting {
    public static int longestSubarray(int[] nums) {
        boolean isZero = false;
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                if (isZero) {
                    while (left < right && nums[left] != 0) {
                        left++;
                    }
                    left++;
                }
                else {
                    isZero = true;
                }
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
}
