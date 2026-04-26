package Leetcode;

import java.util.Arrays;

public class Q498_DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int [] result = new int[mat.length * mat[0].length];
        int index = 0, row = 0, col = 0, m = mat.length, n = mat[0].length;

        while (index < result.length) {
            result[index++] = mat[row][col];
            if ((row+col)%2 == 0) {
                if (col == n-1) {
                    row++;
                }
                else if (row == 0) {
                    col++;
                }
                else {
                    row--;
                    col++;
                }
            }
            else {
                if (row == m-1) {
                    col++;
                }
                else if (col == 0) {
                    row++;
                }
                else {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,2},{3,4}};
        System.out.println(Arrays.toString(findDiagonalOrder(matrix)));
    }
}
