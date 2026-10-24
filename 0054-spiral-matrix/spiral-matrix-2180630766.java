class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();

        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1;

        while (top <= bottom && left <= right && spiral.size() < matrix.length * matrix[0].length) {
            for (int i = left; i <= right && spiral.size() < matrix.length * matrix[0].length; i++) {
                spiral.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom && spiral.size() < matrix.length * matrix[0].length; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;

            for (int i = right; i>= left && spiral.size() < matrix.length * matrix[0].length; i--) {
                spiral.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top && spiral.size() < matrix.length * matrix[0].length; i--) {
                spiral.add(matrix[i][left]);
            }
            left++;
        }   

        return spiral;
    }
}
