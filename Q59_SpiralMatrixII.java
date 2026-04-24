package Leetcode;

public class Q59_SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];
        int top = 0, right = n-1, bottom = n-1, left = 0, num =1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            for (int i = right; i>= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i>= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        int [][] matrix = generateMatrix(3);
        Q2326_SpiralMatrixIV.printMatrix(matrix);
    }
}
