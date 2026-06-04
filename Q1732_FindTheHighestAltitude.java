package Leetcode;

public class Q1732_FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int max = 0, sum = 0;

        for (int i: gain) {
            sum += i;
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int [] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
}
