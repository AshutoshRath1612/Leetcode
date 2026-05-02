package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q448_FindAllNumbersDisappearedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int index = 0;

        while (index < nums.length) {
            if (nums[index] == index + 1) {
                index++;
                continue;
            }
            while (index < nums.length && nums[index] != index + 1) {
                if (nums[index] == index + 1 || nums[nums[index] - 1] == nums[index]) {
                    index++;
                } else {
                    swap(nums, index, nums[index] - 1);
                }
            }
            index++;
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
