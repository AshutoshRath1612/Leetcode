import java.util.HashMap;

public class Q3026_MaximumGoodSubarraySum {
    public static long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Long> hm = new HashMap<>();
        long maxSum = Long.MIN_VALUE, sum = 0;

        for (int i: nums) {
            hm.put(i, Math.min(hm.getOrDefault(i, Long.MAX_VALUE), sum));
            sum += i;

            if (hm.containsKey(i - k)) {
                maxSum = Math.max(maxSum, sum - hm.get(i - k));
            }
            if (hm.containsKey(i + k)) {
                maxSum = Math.max(maxSum, sum - hm.get(i + k));
            }
        }
        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
    static void main() {
        int [] arr = {3,3,2};
        int k = 1;
        System.out.println(maximumSubarraySum(arr, k));
    }
}
