package Leetcode;

public class Greatest_Common_Divisor_of_Strings {
    public static String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)){
            int gcd = gcd(str1.length(),str2.length());
            return str1.substring(0,gcd);
        }
        return "";
    }
    public static int gcd(int x,int y){
        if(x<y)
            return gcd(y,x);
        return y==0 ? x : gcd(y,x%y);
    }

    public static void main(String[] args) {
        String str1 = "ABCABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1,str2));
    }
}
