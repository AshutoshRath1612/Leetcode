package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1914_CyclicallyRotatingAGrid {
    public static int[][] rotateGrid(int[][] grid, int k) {
        List<List<Integer>> layers = createLayerArray(grid);
        for (List<Integer> layer : layers) {
            int rotate = k % layer.size();
            Collections.rotate(layer, -rotate);
        }
        setLayerArray(grid, layers);
        return grid;
    }

    public static List<List<Integer>> createLayerArray(int[][] grid) {
        List<List<Integer>> layers = new ArrayList<>();
        int top = 0, right = grid[0].length - 1, bottom = grid.length - 1, left = 0;
        while (top < bottom && left < right) {
            List<Integer> al = new ArrayList<>();
            for (int j = left; j < right; j++) {
                al.add(grid[top][j]);
            }

            for (int j = top; j < bottom; j++) {
                al.add(grid[j][right]);
            }

            for (int j = right; j > left; j--) {
                al.add(grid[bottom][j]);
            }
            for (int j = bottom; j > top; j--) {
                al.add(grid[j][left]);
            }
            right--;
            top++;
            bottom--;
            left++;

            layers.add(al);
        }
        return layers;
    }

    public static void setLayerArray(int[][] grid, List<List<Integer>> layers) {
        int top = 0, right = grid[0].length - 1, bottom = grid.length - 1, left = 0;
        int i = 0;
        while (top < bottom && left < right) {
            List<Integer> al = layers.get(i++);
            int index = 0;
            for (int j = top; j < right; j++) {
                grid[top][j] = al.get(index++);
            }

            for (int j = top; j < bottom; j++) {
                grid[j][right] = al.get(index++);
            }

            for (int j = right; j > left; j--) {
                grid[bottom][j] = al.get(index++);
            }
            for (int j = bottom; j > top; j--) {
                grid[j][left] = al.get(index++);
            }
            left++;
            right--;
            bottom--;
            top++;
        }
    }
    public static void main(String[] args) {
        int [][] matrix = {{40,10}, {30,20}};
        rotateGrid(matrix,2);

        Q2326_SpiralMatrixIV.printMatrix(matrix);
    }
}
