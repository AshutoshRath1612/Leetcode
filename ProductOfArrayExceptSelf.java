package Leetcode;

import java.util.Arrays;

/*

 */
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int l=1;
        for(int i=0; i<nums.length; i++){
            res[i]=l;
            l*=nums[i];
        }
        int r = 1;
        for(int i=nums.length-1; i>=0; i--){
            res[i]*=r;
            r*=nums[i];
        }

        return res;
    }
    public int[] productExceptSelf1(int[] nums) {
        int [] products = new int[nums.length];
        products[0] = 1;
        for(int i = 1 ; i < nums.length;i++){
            products[i] = products[i-1] * nums[i-1];
        }
        int suffixProduct = 1;
        for(int i = products.length-1;i>=0;i--){
            products[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return products;
    }

    public static void main(String[] args) {
        int []arr = {-1,1,0,-3,3};
        int []res = productExceptSelf(arr);
        System.out.println(Arrays.toString(res));
    }
}
