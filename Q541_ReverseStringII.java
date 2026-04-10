package Leetcode;

/*
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them.
If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
 */
public class Q541_ReverseStringII {
    public static String reverseStr(String s, int k) {
       char [] c =s.toCharArray();

       for (int i = 0 ; i < s.length() ; i += 2*k) {
           int left = i, right = Math.min(left + k - 1, s.length() - 1);

           while (left < right) {
               char temp = c[left];
               c[left] = c[right];
               c[right] = temp;
               left++;
               right--;
           }
       }

       return new String(c);
    }
    public static void main(String[] args) {
        String str = "abcdefghij";
        int k = 4;
        System.out.println(reverseStr(str, k));
    }
}
