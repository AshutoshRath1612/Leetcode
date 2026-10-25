class Solution {
    public void sortColors(int[] nums) {
        int [] counts = new int[3];

        for (int i: nums) {
            counts[i]++;
        }
        
        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i]-- > 0) {
                nums[index++] = i;
            }
        }
    }
}
