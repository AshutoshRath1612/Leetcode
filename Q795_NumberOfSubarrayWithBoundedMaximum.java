package Leetcode;

public class Q795_NumberOfSubarrayWithBoundedMaximum {
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return bound(nums,right) - bound(nums, left-1);
    }
    public static int bound(int [] nums, int bound) {
        int ans = 0, curr = 0;

        for (int i: nums) {
            curr++;
            if (i > bound) {
                curr = 0;
            }
            ans += curr;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {2,1,4,3};
        int left = 2, right = 3;
        System.out.println(numSubarrayBoundedMax(nums,left,right));
    }
}
