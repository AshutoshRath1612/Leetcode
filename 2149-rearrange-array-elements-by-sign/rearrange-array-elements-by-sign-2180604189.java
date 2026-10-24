class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int pIndex = 0, nIndex = 1;

        for (int i: nums) {
            if (i > 0) {
                result[pIndex] = i;
                pIndex+=2;
            }
            else {
                result[nIndex] = i;
                nIndex+=2;
            }
        }

        return result;
    }
}
