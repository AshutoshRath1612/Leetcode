package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q442_FindAllDuplicateInAnArray {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int index = 0;

        while (index < nums.length) {
            int numIndex = nums[index] - 1;
            if (nums[numIndex] != nums[index]) {
                int temp = nums[numIndex];
                nums[numIndex] = nums[index];
                nums[index] = temp;
            } else {
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                al.add(nums[i]);
            }
        }

        return al;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }
}
