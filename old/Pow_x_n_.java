package Leetcode;

/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 */
public class Pow_x_n_ {
    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public static double myPow2(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        double ans = 1;
        while(n != 0){
            if(n%2 != 0){
                ans *= x;
            }
            x *= x;
             n /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        double n = 2.00000;
        int pow = -2;
        double ans = myPow2(n, pow);
        System.out.println(ans);
    }
}
