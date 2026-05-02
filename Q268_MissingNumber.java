package Leetcode;


public class Q268_MissingNumber {
    public static int missingNumber(int[] nums) {
        int index = 0;

        while (index < nums.length) {
            if (nums[index] == index) {
                index++;
                continue;
            }

            while (index < nums.length && nums[index] != index) {
                if (nums[index] == nums.length) {
                    index++;
                    continue;
                } else {
                    swap(nums, index, nums[index]);
                }
            }
            index++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int missingNumber2(int[] nums) {
        int sum = (nums.length * (nums.length + 1)) / 2;

        for (int i : nums) {
            sum -= i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumber2(arr));
    }
}
