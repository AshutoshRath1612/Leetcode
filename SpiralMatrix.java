package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>spiral = new ArrayList<>();
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int left = 0;
        int n=0;
        while (n< matrix.length*matrix[0].length){
            if (left==right&& right==top&& top==bottom&& bottom==left) {
                spiral.add(matrix[left][right]);
                break;
            }
            for (int i=left;i<right && n< matrix.length*matrix[0].length;i++){
                spiral.add(matrix[top][i]);
                n++;
            }
            for (int i=top;i<bottom && n< matrix.length*matrix[0].length;i++){
                spiral.add(matrix[i][right]);
                n++;
            }
            for (int i=right;i>left && n< matrix.length*matrix[0].length;i--){
                spiral.add(matrix[bottom][i]);
                n++;
            }
            for (int i=bottom;i>top && n< matrix.length*matrix[0].length;i--){
                spiral.add(matrix[i][left]);
                n++;
            }
            top++;
            right--;
            bottom--;
            left++;
        }
        return spiral;
    }
    public static void main(String[] args) {
        int [][]matrix = {{6,9,7}};
        List<Integer> spiral = spiralOrder(matrix);
        System.out.println(spiral);
    }
}
