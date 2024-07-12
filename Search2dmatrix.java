package Leetcode;

/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 */
public class Search2dmatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int s = 0;
        int e = matrix.length-1;
        while(s<=e){
            if(s==e){
                return binarySearch(matrix[e],target);
            }
            int midRow = s + (e-s)/2;
            int midColumn = (matrix[midRow].length)/2;
            if(matrix[midRow][midColumn] > target){
                e = midRow;
            }
            else if(matrix[midRow][midColumn] < target){
                if(matrix[midRow][matrix[midRow].length-1] >= target){
                    e = midRow;
                }
                else{

                    s = midRow+1;
                }
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static boolean binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start <=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] arr= {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 7;
        System.out.println(searchMatrix(arr, target));
    }
}
