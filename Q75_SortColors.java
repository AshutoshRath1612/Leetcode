package Leetcode;

import java.util.Arrays;

public class Q75_SortColors {
    public static void sortColors(int[] nums) {
       int [] counts = new int[3];

       for (int i: nums) {
           counts[i]++;
       }

       for (int i =0, index = 0; i < counts.length; i++) {
           while (counts[i]-- > 0) {
               nums[index++] = i;
           }
       }
    }
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
