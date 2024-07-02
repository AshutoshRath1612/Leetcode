package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.
 */
public class SetMatrixZero {
    public static void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>>al = new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]==0){
                    ArrayList<Integer>index = new ArrayList<>();
                    index.add(i);
                    index.add(j);
                    al.add(index);
                }
            }
        }
        for (int i=0;i<al.size();i++){
            int row = al.get(i).get(0);
            int column =al.get(i).get(1);
            for (int j = 0;j<matrix[row].length;j++){
                matrix[row][j]=0;
            }
            for (int j=0;j<matrix.length;j++){
                matrix[j][column]=0;
            }
        }
        System.out.println(al);
    }
    public static void setZero1(int [][] matrix) {
        boolean [][] isZero = new boolean[matrix.length][matrix[0].length];
        for(int i = 0 ; i<matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    isZero[i][j] = true;
                }
            }
        }
        for(int i =0;i<isZero.length;i++){
            for(int j = 0;j<isZero[i].length;j++){
                if(isZero[i][j]){
                    for(int row = 0; row<isZero[i].length;row++){
                        matrix[i][row] = 0;
                    }
                    for(int column = 0 ; column<isZero.length;column++){
                        matrix[column][j] = 0;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][]matrix={
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        setZero1(matrix);
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
