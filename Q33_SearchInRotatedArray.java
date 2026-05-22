public class Q33_SearchInRotatedArray {
    public static int search(int[] nums, int target) {
        int peakIndex = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                peakIndex = i;
                break;
            }
        }

        int leftHalf = findIndex(nums,0,peakIndex, target);
        int rightHalf = findIndex(nums,peakIndex+1,nums.length-1, target);

        return leftHalf == -1 ? rightHalf : leftHalf;
    }
    public static int findIndex(int [] nums, int s, int e, int target) {
        int mid = s + (e-s)/2;

        while (s <= e) {
            if (nums[mid] > target) {
                return findIndex(nums, s, mid-1, target);
            }
            else if (nums[mid] < target) {
                return findIndex(nums, mid+1, e, target);
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static void main() {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
}