import java.util.*;

public class Q2161_PartitionArrayAccordingGivenPoint {
    public static int[] pivotArray1(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int i: nums) {
            if (i < pivot) {
                less.add(i);
            }
            else if (i == pivot) {
                equal.add(i);
            }
            else {
                greater.add(i);
            }
        }
        int index = 0;
        for (Integer i: less) {
            nums[index++] = i;
        }
        for (Integer i: equal) {
            nums[index++] = i;
        }
        for (Integer i: greater) {
            nums[index++] = i;
        }
        return nums;
    }
    public static int[] pivotArray(int [] nums, int pivot) {
        int left = 0, right = nums.length - 1;
        int [] result = new int[nums.length];

        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            if (nums[i] < pivot) {
                result[left++] = nums[i];
            }

            if (nums[j] > pivot) {
                result[right--] = nums[j];
            }
        }
        while (left <= right) {
            result[left++] = pivot;
        }

        return result;
    }
    static void main() {
        int [] arr = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(arr,pivot)));
    }
}
