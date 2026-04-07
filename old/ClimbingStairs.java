package Leetcode;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1)
            return 1;
        int arr[] = new int[n];
        arr[n - 1] = 1;
        arr[n - 2] = 2;
        for (int i = n - 3; i >= 0; i--) {
            arr[i] = arr[i + 1] + arr[i + 2];
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }
}
