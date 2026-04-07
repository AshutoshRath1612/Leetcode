package Leetcode;

public class Sqrt_x {
    public static int mySqrt(int x) {
        long s=0;
        long e=x/2;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid*mid>x){
                if(mid>0 && (mid-1)*(mid-1)<x)
                    return (int)mid-1;
                e=mid-1;
            }
            else if(mid*mid<x){
                if(mid<x && (mid+1)*(mid+1)>x)
                    return (int)mid;
                s=mid+1;
            }
            else
                return (int)mid;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }
}
