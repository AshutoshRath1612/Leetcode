class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, prefix = 1, suffix = 1;

        for (int i = 0, j = nums.length-1; i < nums.length && j >= 0; i++, j--) {
            prefix *= nums[i];
            suffix *= nums[j];

            max = Math.max(max, Math.max(prefix, suffix));

            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }
        }

        return max;
    }
}
