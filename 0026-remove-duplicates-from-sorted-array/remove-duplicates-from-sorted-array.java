class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0, currentIndex = 0;

        while (index < nums.length) {
            while (index < nums.length && nums[index] == nums[currentIndex]){
                index++;
            }

            if (index < nums.length && ++currentIndex < nums.length) {
                nums[currentIndex] = nums[index];
            }
        }
        return currentIndex+1;
    }
}
