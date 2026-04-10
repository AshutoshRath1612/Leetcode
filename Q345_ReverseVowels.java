package Leetcode;

import java.util.List;

public class Q345_ReverseVowels {

    // String approach
    public static String reverseVowelsStringApproach(String s) {
        int left = 0, right = s.length() - 1;

        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder sb = new StringBuilder(s);

        while (left < right) {
            while (left < s.length() && !vowels.contains(sb.charAt(left))) {
                left++;
            }
            while (right > 0 && !vowels.contains(sb.charAt(right))) {
                right--;
            }

            if (left >= right) {
                break;
            }
            char temp = sb.charAt(left);
            sb.replace(left,left+1, String.valueOf(sb.charAt(right)));
            sb.replace(right,right+1, String.valueOf(temp));
            left++;
            right--;
        }

        return sb.toString();
    }

    public static String reverseVowels(String s) {
        char [] c = s.toCharArray();
        String vowels = "aeiouAEIOU";

        int left = 0, right = s.length() - 1;

        while(left < right) {
            while (left < s.length() && vowels.indexOf(c[left]) == -1) {
                left++;
            }

            while (right >= 0 && vowels.indexOf(c[right]) == -1) {
                right--;
            }

            if (left >= right)
                break;

            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }

        return new String(c);
    }

    public static void main(String[] args) {
        String str = "rhythm";
        System.out.println(reverseVowels(str));
    }
}
