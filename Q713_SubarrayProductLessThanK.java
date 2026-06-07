public class Q713_SubarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        long product = 1;
        int count = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (left <= right && product >= k) {
                product /= nums[left++];
            }
            count += right - left + 1;
        }
        return count;
    }
    static void main() {
        int [] nums = {1,2,3};
        int k = 0;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }
}
