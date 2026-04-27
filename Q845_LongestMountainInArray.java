package Leetcode;

public class Q845_LongestMountainInArray {
    public static int longestMountain(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        int longest = 0, startIndex = 0, i= 0;

        while (i < arr.length) {
            while (i+1 < arr.length && arr[i] >= arr[i+1]) {
                i++;
            }
            startIndex = i;

            while (i < arr.length-1 && arr[i] < arr[i+1]) {
                i++;
            }
            if (i < arr.length - 1 && arr[i] > arr[i+1]) {
                while (i < arr.length - 1 && arr[i] > arr[i+1]) {
                    i++;
                }
                longest = Math.max(longest, i - startIndex + 1);
                startIndex = i -1;
            }
            else {
                startIndex = ++i;
            }
        }
        return longest;
    }

    public static int longestMountain2(int [] arr) {
        int longest = 0, i = 1;

        while (i < arr.length-1) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                int left = i, right = i;

                while (left > 0 && arr[i] > arr[i-1]) {
                    left--;
                }

                while (right < arr.length-1 && arr[right] < arr[right+1]) {
                    right++;
                }

                longest = Math.max(longest, right-left+1);
                i = right;
            }
            i++;
        }
        return longest;
    }
    public static void main(String[] args) {
        int [] arr = {2,1,4,7,3,2,5};
        System.out.println(longestMountain(arr));
        System.out.println(longestMountain2(arr));
    }
}
