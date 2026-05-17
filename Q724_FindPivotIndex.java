public class Q724_FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0, totalSum = 0;

        for (int i: nums) {
            totalSum += i;
        }

        for (int i = 0; i < nums.length; i++) {
            if (totalSum - nums[i] == leftSum) {
                return i;
            }
            leftSum += nums[i];
            totalSum -= nums[i];
        }

        return -1;
    }
    static void main() {
        int [] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
