package Leetcode;

import java.util.Arrays;

public class SpiralMatrix_II {
    public static int[][] generateMatrix(int n) {
        int [][] spiral = new int[n][n];
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int left = 0;
        int curr = 1;
        while(curr <= n*n){
            if(left==right && top==bottom){
                spiral[top][left] = curr;
                break;
            }
            for(int i=left;i<right;i++){
                spiral[top][i] = curr++;
            }
            for(int i = top;i<bottom;i++){
                spiral[i][right] = curr++;
            }
            for(int i = right;i>left;i--){
                spiral[bottom][i] = curr++;
            }
            for(int i = bottom;i>top;i--){
                spiral[i][left] = curr++;
            }
            top++;
            right--;
            bottom--;
            left++;
        }
        return spiral;
    }

    public static void main(String[] args) {
        int n= 1;
        int [][]arr = generateMatrix(n);
        display(arr);
    }
    public  static void display(int [][]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
