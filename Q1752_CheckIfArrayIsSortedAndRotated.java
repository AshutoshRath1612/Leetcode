public class Q1752_CheckIfArrayIsSortedAndRotated {
    public static boolean check(int[] nums) {
        int rotateIndex = findRotateIndex(nums);
        if (rotateIndex != -1) {
            rotateArray(nums,0, rotateIndex-1);
            rotateArray(nums,rotateIndex, nums.length-1);
            rotateArray(nums, 0 , nums.length-1);
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static int findRotateIndex(int [] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                return i;
            }
        }
        return -1;
    }
    public static void rotateArray (int[] arr, int s, int e) {
        for (int i = s; i <= e; i++, e--) {
            int temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
        }
    }
    public static boolean check2(int [] nums) {
        int index = 1, n = nums.length;

        if (nums[0] < nums[n-1]){
            return checkIfSorted(nums,0,n-1);
        }

        while (index < n && nums[index] >= nums[index-1]) {
            index++;
        }
        return checkIfSorted(nums, 0 , index-1) && checkIfSorted(nums, index, n-1);
    }
    public static boolean checkIfSorted(int [] nums, int s, int e) {
        for (int i = s+1; i <= e; i++) {
            if (nums[i] < nums[i-1])
                return false;
        }
        return true;
    }
    static void main() {
        int [] arr = {3,4,5,1,2};
        System.out.println(check2(arr));
    }
}
