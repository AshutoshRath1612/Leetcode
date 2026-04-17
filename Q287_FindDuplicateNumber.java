package Leetcode;

public class Q287_FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int [] arr = new int[100001];

        for (int i : nums) {
            if (arr[i] == 1) return i;
            arr[i]++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
