package Leetcode;

import java.util.Arrays;

public class FindRotation {
    public static boolean findRotation(int[][] mat, int[][] target) {
        if (Arrays.deepEquals(mat,target))
            return true;
        for(int i = 0 ; i < 3; i++){
            int [][] rotate = new int[mat.length][mat[0].length];
            for (int row = 0; row < mat.length; row++){
                for(int column = 0; column < mat[row].length; column++){
                    rotate[column][mat.length-1-row] = mat[row][column];
                }
            }
            if (Arrays.deepEquals(rotate, target)){
                return true;
            }
            else {
                mat = rotate;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int [][] target = {{1,1,1}, {0,1,0},{0,0,0}};
        System.out.println(findRotation(mat,target));
    }
}
