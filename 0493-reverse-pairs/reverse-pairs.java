class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    public int mergeSort(int[] nums, int start, int end) {
        int count = 0;

        if (start == end) {
            return 0;
        }

        int mid = start + (end - start)/2;

        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid+1, end);
        count += merge(nums, start, mid, end);

        return count;
    }

    public int merge(int [] nums, int start, int mid, int end) {
        int count = 0;

        int i = start, j = mid+1, index = 0;

        int[] temp = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (nums[i] > 2L * nums[j]) {
                count += mid - i + 1;
                j++;
            }
            else  {
                i++;
            }
        }

        i = start;
        j = mid+1;

        while (i <= mid && j <= end) {
            if (nums[i] > nums[j]) {
                temp[index++] = nums[j++];
            }
            else {
                temp[index++] = nums[i++];
            }
        }

        while (i <= mid) {
            temp[index++] = nums[i++];
        }
        while (j <= end) {
            temp[index++] = nums[j++];
        }

        index = 0;

        for (i = start; i <= end; i++) {
            nums[i] = temp[index++];
        }

        return count;
    }
}
