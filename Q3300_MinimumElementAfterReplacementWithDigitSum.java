package Leetcode;

public class Q3300_MinimumElementAfterReplacementWithDigitSum {
    public static int minElement(int[] nums) {
        int minNumber = Integer.MAX_VALUE;

        for (int i: nums) {
            int sum = 0;

            while (i > 0) {
                sum += i%10;
                i = i/10;
            }
            minNumber = Math.min(minNumber, sum);
        }
        return minNumber;
    }
    public static void main(String[] args) {
        int [] arr = {10,12,13,14};
        System.out.println(minElement(arr));
    }
}
