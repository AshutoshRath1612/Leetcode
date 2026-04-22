package Leetcode;

import java.util.Arrays;

public class Q867_TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int [][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i<matrix[0].length; i++) {
            for(int j = 0; j<matrix.length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6}};
        int [][] transpose = transpose(matrix);
        for (int [] arr : transpose) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
