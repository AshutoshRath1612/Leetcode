class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = i; j < matrix.length-1-i; j++) {
                swap(matrix, i, j, j, matrix.length - 1 - i);
                swap(matrix, i, j, matrix.length - 1 - i, matrix.length - 1- j);
                swap(matrix, i, j, matrix.length - 1 - j, i);
            }
        }
    }
    public void swap(int [][] matrix, int row1, int column1, int row2, int column2) {
        int temp = matrix[row1][column1];
        matrix[row1][column1] = matrix[row2][column2];
        matrix[row2][column2] = temp;
    }
}
