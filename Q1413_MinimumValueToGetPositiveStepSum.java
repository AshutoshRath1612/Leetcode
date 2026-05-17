public class Q1413_MinimumValueToGetPositiveStepSum {
    public static int minStartValue(int[] nums) {
        int sum = 0, minPrefixSum = 1;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            minPrefixSum = Math.min(sum, minPrefixSum);
        }

        return (minPrefixSum >= 1) ? minPrefixSum : (Math.abs(minPrefixSum) + 1);
    }

    static void main() {
        int [] arr = {-3,2,-3,4,2};
        System.out.println(minStartValue(arr));
    }
}
