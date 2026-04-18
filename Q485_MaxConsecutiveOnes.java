package Leetcode;

public class Q485_MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, currentCount = 0;

        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == 1)
                currentCount++;
            else
                currentCount = 0;

            maxCount = Math.max(maxCount,currentCount);
        }

        return maxCount;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
