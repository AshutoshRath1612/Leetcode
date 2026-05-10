package Leetcode;

public class Q643_MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        for (int i=k; i < nums.length;i++) {
            sum += nums[i] - nums[i-k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum/k;
    }

    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(arr,k));
    }
}
