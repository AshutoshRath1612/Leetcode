package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits
 */
public class PlusOne {
    public static int[] plusOne1(int[] digits) {
        int sum =0;
        int carry=0;
        int add = digits[digits.length-1]+1;
        digits[digits.length-1] = add%10;
        carry =add/10;
        if(carry>0){
            for (int i= digits.length-2;i>=0;i--) {
                add = digits[i]+carry;
                digits[i] = add%10;
                carry = add/10;

                if (carry==0)
                    break;
            }
            if (carry>0){
                int []addd = new int[digits.length+1];
                addd[0] = carry;
                for (int i=0;i< digits.length;i++){
                    addd[i+1] = digits[i];
                }
                return addd;
            }
            return digits;
        }
        else
            return digits;
    }
    public static int[] plusOne(int[] digits) {
        List<Integer> sum = new ArrayList<>();
        int carry  =1;
        for(int i = digits.length - 1; i>=0;i--){
            int num = digits[i] + carry;
            sum.add(0,num%10);
            carry = num / 10;
        }
        while(carry > 0){
            sum.add(0,carry%10);
            carry = carry/10;
        }
        int []sumArr = new int[sum.size()];
        for(int i = 0 ; i < sum.size(); i++){
            sumArr[i] = sum.get(i);
        }
        return sumArr;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        int []add = plusOne(arr);
        System.out.println(Arrays.toString(add));
    }
}
