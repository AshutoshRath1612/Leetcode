package Leetcode;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int row=0;
        while(row<matrix.length/2){
            int column = row;
            while(column<matrix.length-1-row){
                swap(matrix,row,column,column,matrix.length-1-row);
                swap(matrix,row,column,matrix.length-1-row,matrix.length-1-column);
                swap(matrix,row,column,matrix.length-1-column,row);
                column++;
            }
            row++;
        }
    }
    // public static void printmatrix(int matrix[][]){
    //        for(int k=0;k<matrix.length;k++){
    //                 for(int l=0;l<matrix.length;l++){
    //                     System.out.print(matrix[k][l] +" ");
    //                 }
    //                 System.out.println();
    //             }
    // }
    public static void swap(int[][] matrix , int row1 , int column1 , int row2 , int column2){
        int temp = matrix[row1][column1];
        matrix[row1][column1] = matrix[row2][column2];
        matrix[row2][column2] = temp;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(arr));
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
