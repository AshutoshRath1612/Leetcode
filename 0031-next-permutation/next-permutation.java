class Solution {
    public void nextPermutation(int[] nums) {
        int pivotIndex = -1;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]) {
                pivotIndex = i;
            }
        }

        if (pivotIndex == -1) {
            Arrays.sort(nums);
        }
        else {
            Arrays.sort(nums, pivotIndex+1, nums.length);

            for(int i = pivotIndex; i < nums.length; i++){

                if (nums[pivotIndex] < nums[i]) {

                int temp = nums[pivotIndex];
                nums[pivotIndex] = nums[i];
                nums[i] = temp;
                break;
                }
            }   
        }
    }
}
