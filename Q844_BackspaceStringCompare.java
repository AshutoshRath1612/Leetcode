package Leetcode;

public class Q844_BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {

        if (s.equals(t))
            return true;

        int sPointer = s.length()-1, tPointer = t.length()-1, sSkip = 0, tSkip = 0;

        while (sPointer >= 0 && tPointer >= 0) {
            while (sPointer >= 0) {
               if (s.charAt(sPointer) == '#') {
                   sSkip++;
                   sPointer--;
               }
               else if (sSkip > 0) {
                   sSkip--;
                   sPointer--;
               }
               else {
                   break;
               }
            }
            while (tPointer >= 0) {
                if (t.charAt(tPointer) == '#') {
                    tSkip++;
                    tPointer--;
                }
                else if (tSkip > 0) {
                    tSkip--;
                    tPointer--;
                }
                else {
                    break;
                }
            }

            if (sPointer >= 0 && tPointer >= 0 && s.charAt(sPointer) != t.charAt(tPointer))
                return false;

            if ((sPointer >= 0) != (tPointer >= 0))
                return false;
            sPointer--;
            tPointer--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "bxj##tw";
        String t = "bxj###tw";
        System.out.println(backspaceCompare(s,t));
    }
}
