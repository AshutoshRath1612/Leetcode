package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q43_MultiplyStrings {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int j = num2.length()-1;
        List<StringBuilder> result = new ArrayList<>();

        while (j >= 0) {
            int digit = num2.charAt(j) - '0';
            result.addFirst(addTens(calculateMultiply(num1, digit), result.size()));
            j--;
        }
        long ans = 0;
        System.out.println(result);
        return calculateSum(result);
    }
    public static StringBuilder calculateMultiply(String num, int digit) {
        int i = num.length()-1;
        long carry=0;
        StringBuilder result = new StringBuilder();
        while(i>=0 || carry!=0) {
            long multiply = 0;
            if (i >= 0) {
                int firstDigit = num.charAt(i) - '0';
                multiply = firstDigit * digit;
            }
            multiply += carry;
            result.insert(0,multiply%10);
            carry = multiply/10;
            i--;
        }

        return result;
    }

    public static StringBuilder addTens(StringBuilder num, int tens) {
        while (tens > 0) {
            num.append('0');
            tens--;
        }
        return num;
    }

    public static String calculateSum(List<StringBuilder> nums) {
        StringBuilder result = new StringBuilder();
        int carry = 0, index = nums.size() - 1;

        while(index>= 0 || carry!= 0) {
            if(index >= 0) {
                StringBuilder num = nums.get(index);
                StringBuilder sum = new StringBuilder();
                int numIndex = num.length() - 1, resultIndex = result.length() - 1;

                while (numIndex >= 0 || resultIndex >= 0 || carry!= 0) {
                    if (numIndex >= 0) {
                        carry += num.charAt(numIndex) - '0';
                        numIndex--;
                    }
                    if (resultIndex >= 0) {
                        carry += result.charAt(resultIndex) - '0';
                        resultIndex--;
                    }
                    sum.insert(0, carry%10);
                    carry = carry/10;
                }
                result = sum;
                index--;
            }
        }

        if (carry > 0){
            result.insert(0,carry%10);
            carry = carry/10;
        }

        return result.toString();
    }

    public static String multiply2(String num1, String num2) {
        // The multiplication of both the number can not go beyond the sum of the length of both the number
        int [] result = new int[num1.length() + num2.length()];
        for (int i = num1.length()-1; i>=0; i--){
            for (int j = num2.length()-1; j>=0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                product += result[i + j + 1];

                result[i+j+1] = product%10;
                result[i+j] += product/10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < result.length;i++) {
            if (sb.length() == 0 && result[i] == 0) continue;
            sb.append(result[i]);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
    public static void main(String[] args) {
        String num1 = "123", num2 = "456";
        System.out.println(multiply2(num1,num2));
    }
}
