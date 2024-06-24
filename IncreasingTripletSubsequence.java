package Leetcode;

public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
       int min = Integer.MAX_VALUE , secondmin = Integer.MAX_VALUE;
       for (int n: nums){
           if (min>=n)
               min = n;
           else if(secondmin>n)
               secondmin = n;
           else if(secondmin<n)
               return true;
       }
       return false;
    }
    public static void main(String[] args) {
        int nums[] = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(nums));
    }
}
