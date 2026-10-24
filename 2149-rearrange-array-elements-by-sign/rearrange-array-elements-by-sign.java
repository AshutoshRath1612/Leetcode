class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int pIndex = 0, nIndex = 0, rIndex = 0;

        while (pIndex < n && nIndex < n) {
            while (pIndex < n && nums[pIndex] < 0) {
                pIndex++;
            }

            while (nIndex < n && nums[nIndex] > 0) {
                nIndex++;
            }

            if (pIndex < n) {
                result[rIndex++] = nums[pIndex++];
            }

            if (nIndex < n) {
                result[rIndex++] = nums[nIndex++];
            }
        }

        return result;
    }
}
