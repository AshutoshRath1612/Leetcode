package Leetcode;

public class ReverseVowellInString {
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;int j=s.length()-1;
        while(i<j){
            char first = sb.charAt(i);
            char second = sb.charAt(j);
            while (i<j&& first != 'a' && first!='A'
                    && first!= 'e' && first != 'E'
                    && first != 'i' && first!= 'I'
                    && first != 'o' && first != 'O'
                    && first != 'u' && first!='U'){
                i++;
                first = sb.charAt(i);
            }
            while (i<j&&second != 'a' && second!='A'
                    && second!= 'e' && second != 'E'
                    && second != 'i' && second!= 'I'
                    && second != 'o' && second != 'O'
                    && second != 'u' && second!='U'){
                j--;
                second = sb.charAt(j);
            }
            sb.replace(i ,i+1, String.valueOf(second));
            sb.replace(j, j+1, String.valueOf(first));
            i++;
            j--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
