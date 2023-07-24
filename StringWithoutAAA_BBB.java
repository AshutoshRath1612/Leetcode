package Leetcode;

public class StringWithoutAAA_BBB {
    public static String strWithout3a3b(int a, int b) {
        StringBuilder str = new StringBuilder("");
        while (a!=0 || b!=0) {
            int l = str.length()-1;
            if (l >= 2) {
                if (str.charAt(l-1)!='a' && str.charAt(l-2)!='a') {
                    str.append("a");
                    a--;
                } else {
                    str.append("b");
                    b--;
                }
            } else {
                if (a >= b) {
                    str.append("a");
                    a--;
                } else {
                    str.append("b");
                    b--;
                }
            }
        }
        while (a!=0){
            str.append("a");
            a--;
        }
        while (b!=0){
            str.append("b");
            b--;
        }
        return str.toString();
    }
    public static void main(String[] args) {
        int a=4;
        int b=1;
        String str = strWithout3a3b(a,b);
        System.out.println(str);
    }
}
