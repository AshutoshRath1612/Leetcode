package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q54_SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, right = matrix[0].length-1, bottom = matrix.length-1, left = 0, n = 0;

        while (top <= bottom && left <= right) {
            if (top == bottom && left == right) {
                result.add(matrix[top][left]);
                n++;
            }
            for (int i = left; i < right && n < matrix.length * matrix[0].length; i++) {
                result.add(matrix[top][i]);
                n++;
            }

            for (int i = top; i < bottom && n <  matrix.length * matrix[0].length; i++) {
                result.add(matrix[i][right]);
                n++;
            }
            for (int i = right; i>left && n <  matrix.length * matrix[0].length; i--) {
                result.add(matrix[bottom][i]);
                n++;
            }
            for (int i = bottom; i>top && n <  matrix.length * matrix[0].length; i--) {
                result.add(matrix[i][left]);
                n++;
            }
            top++;
            left++;
            right--;
            bottom--;
        }
        return result;
    }
    public static void main(String[] args) {
        int [][] matrix = {{6,9,7}};
        System.out.println(spiralOrder(matrix));
    }
}
