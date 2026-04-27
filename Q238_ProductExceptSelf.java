package Leetcode;

import java.util.Arrays;

public class Q238_ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int [] product = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            product[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = nums.length-1; i >= 0 ; i--) {
            product[i] *= suffix;

            suffix *= nums[i];
        }

        return product;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
