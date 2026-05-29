package Leetcode;

public class Q2264_Largest3DigitNumberInString {
    public static String largestGoodInteger(String num) {
        String result = "";

        for (int i=0; i<num.length()-2; i++) {
            char a = num.charAt(i);
            char b = num.charAt(i+1);
            char c = num.charAt(i+2);

            if ((a == b && a == c) && (result.isEmpty() || result.charAt(0) < a)) {
                result = num.substring(i, i+3);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String num = "6777133339";
        System.out.println(largestGoodInteger(num));
    }
}
