package Leetcode;

/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 */
public class Search2dmatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int s =0;
        int e = matrix.length-1;
        while (s<=e){
            if (s==e)
                return binarySearch(target , matrix[s]);
            int midrow = s + (e-s)/2;
            int midcolumn = matrix[midrow].length/2;
            int mid = matrix[midrow][midcolumn];
            if (mid>target)
                e = midrow;
            else if(mid<target)
                if (matrix[midrow][matrix[midrow].length-1]>=target)
                    e=midrow;
                else
                s = midrow+1;
            else
                return true;
        }
        return false;
    }
    static boolean binarySearch(int target , int []matrix){
        int s=0;
        int e =matrix.length-1;
        while (s<=e){
            int mid = s + (e-s)/2;
            if (matrix[mid]>target)
                e = mid-1;
            else if(matrix[mid]<target)
                s = mid+1;
            else
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] arr= {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 7;
        System.out.println(searchMatrix(arr, target));
    }
}
