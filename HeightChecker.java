package Leetcode;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[]expected = heights.clone();
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if (heights[i]!= expected[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int []height = {7,4,5,6,4,2,1,4,6,5,4,8,3,1,8,2,7,6,3,2};
        System.out.println(heightChecker(height));
    }
}
