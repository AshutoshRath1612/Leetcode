class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return nums.length;
    }
    public void sort(int[] nums) {
        int index = 0;

        while (index < nums.length) {
            if (nums[index] == index || nums[index] == nums.length) {
                index++;
                continue;
            }

            int temp = nums[nums[index]];
            nums[nums[index]] = nums[index];
            nums[index] = temp;
        }
    }
}
