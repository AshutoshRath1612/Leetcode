package Leetcode;

import java.util.Arrays;

public class SpiralMatrix_II {
    public static int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int top=0;
        int right = n-1;
        int bottom = n-1;
        int left =0;
        int i=1;
        while(i<=n*n){
            if (left==right&& right==top&& top==bottom&& bottom==left) {
                matrix[left][right]=i;

                break;
            }
            for (int j=left;j<right && i<=n*n;j++){
                matrix[top][j]=i;
                i++;
            }
            for (int j=top;j<bottom && i<=n*n;j++){
                matrix[j][right]=i;
                i++;
            }
            for (int j=right;j>left && i<=n*n;j--){
                matrix[bottom][j]=i;
                i++;
            }
            for (int j=bottom;j>top && i<=n*n;j--){
                matrix[j][left]=i;
                i++;
            }
            top++;
            right--;
            bottom--;
            left++;
        }
        return matrix;
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
