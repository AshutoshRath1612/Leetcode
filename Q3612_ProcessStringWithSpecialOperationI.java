package Leetcode;

public class Q3612_ProcessStringWithSpecialOperationI {
    public static String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()) {
            if (c == '*' && sb.length() != 0) {
                sb.deleteCharAt(sb.length()-1);
            }
            else if (c == '#') {
                sb.append(sb);
            }
            else if (c == '%') {
                sb.reverse();
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "a#b%*";
        System.out.println(processStr(str));
    }
}
