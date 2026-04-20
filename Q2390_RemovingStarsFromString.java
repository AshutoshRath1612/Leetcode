package Leetcode;

import java.util.Stack;

public class Q2390_RemovingStarsFromString {
    public static String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        int index = s.length() - 1, skipStar = 0;

        while (index >= 0) {
            if (s.charAt(index) == '*') {
                skipStar++;
            }
            else if (skipStar > 0) {
                skipStar--;
            }
            else {
                result.insert(0, s.charAt(index));
            }
            index--;
        }


        return result.toString();
    }

    public static String removeStars2(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            if (s.charAt(index) == '*' && !stack.isEmpty()) {
                stack.pop();
            }
            else {
                stack.push(s.charAt(index));
            }
            index++;
        }

        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }

    public static String removeStars3(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                sb.deleteCharAt(sb.length()-1);
            }
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "leet**cod*e";
        System.out.println(removeStars3(str));
    }
}
