import java.util.HashMap;
import java.util.HashSet;

public class Q2461_MaximumSumOfDistinctSubarrayWithLengthK {
    public static long maximumSubarraySum1(int[] nums, int k) {
        long max = 0, sum = 0;
        int left = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            hm.put(nums[right], hm.getOrDefault(nums[right], 0) + 1);
            sum += nums[right];

            if (right >= k) {
                hm.put(nums[left], hm.getOrDefault(nums[left], 0) - 1);
                sum -= nums[left];

                if (hm.get(nums[left]) == 0) {
                    hm.remove(nums[left]);
                }
                left++;
            }

            if (hm.size() == k) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int left = 0;
        long sum = 0, max = 0;

        for (int right = 0; right < nums.length; right++) {
            while (!hs.isEmpty() && hs.contains(nums[right])) {
                sum -= nums[left];
                hs.remove(nums[left++]);
            }
            hs.add(nums[right]);
            sum += nums[right];

            if (right - left + 1 == k) {
                max = Math.max(max, sum);
                sum -= nums[left];
                hs.remove(nums[left++]);
            }
        }
        return max;
    }
    static void main() {
        int [] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));
    }
}
