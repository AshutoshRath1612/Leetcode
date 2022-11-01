package Leetcode;

/*
Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
 */
public class ToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i=0; i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (i-1 >=0 && j-1 >=0){
                    if (matrix[i][j] != matrix[i-1][j-1])
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2},{2,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
}
