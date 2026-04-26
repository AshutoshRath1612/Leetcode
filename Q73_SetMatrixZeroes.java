package Leetcode;

import java.util.Arrays;

public class Q73_SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        boolean[][] isZero = new boolean[matrix.length][matrix[0].length];

        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    isZero[i][j] = true;
                }
            }
        }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (isZero[i][j]) {
                        Arrays.fill(matrix[i], 0);
                        for (int k = 0; k < matrix.length; k++) {
                            matrix[k][j] = 0;
                        }
                    }
                }
            }
    }

    public static void setZeroes2(int [][] matrix) {
        int [] rows = new int[matrix.length];
        int [] cols = new int[matrix[0].length];
        int rowIndex = 0, colIndex = 0;
        for (int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               if (rows[i] == 1 || cols[j] == 1) {
                   matrix[i][j] = 0;
               }
            }
        }
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
        int [][] matrix1 = {{1,1,1}, {1,0,1}, {1,1,1}};
        setZeroes(matrix);
        Q2326_SpiralMatrixIV.printMatrix(matrix);
        System.out.println("--------------------------------------");
        setZeroes2(matrix1);
        Q2326_SpiralMatrixIV.printMatrix(matrix1);
    }
}
