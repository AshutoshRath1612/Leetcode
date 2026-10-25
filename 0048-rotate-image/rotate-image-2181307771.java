class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int row = 0; row < n/2; row++) {
            for (int column = row; column < n - 1 - row; column++) {
                swap(matrix, row, column, column, n - 1 - row);
                swap(matrix, row, column, n - 1 - row, n - 1 - column);
                swap(matrix, row, column, n - 1 - column, row);
            }
        }
    }
    public void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }
}
