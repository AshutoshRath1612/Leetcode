class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length * (nums.length + 1))/2;
        int total = 0;

        for (int i: nums) {
            total += i;
        }

        return sum - total;
    }
}
