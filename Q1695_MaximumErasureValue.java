import java.util.HashSet;

public class Q1695_MaximumErasureValue {
    public static int maximumUniqueSubarray(int[] nums) {
        int maxSum = 0, sum = 0, left = 0;
        HashSet<Integer> unique = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (left < right && unique.contains(nums[right])) {
                sum -= nums[left];
                unique.remove(nums[left++]);
            }
            unique.add(nums[right]);

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
    static void main() {
        int [] nums = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(nums));
    }
}
