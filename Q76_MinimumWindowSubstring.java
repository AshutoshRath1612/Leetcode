import java.util.HashMap;
import java.util.Objects;

public class Q76_MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        int n1 = s.length(), n2 = t.length(), left = 0;

        if (n2 > n1) {
            return "";
        }

        if (s.equals(t)) {
            return s;
        }

        HashMap<Character, Integer> tChar = new HashMap<>();
        HashMap<Character, Integer> currentWindowChar = new HashMap<>();
        int count = 0;
        String ans = "";

        for(char c: t.toCharArray()) {
            tChar.put(c, tChar.getOrDefault(c,0)+1);
        }

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            currentWindowChar.put(c , currentWindowChar.getOrDefault(c,0)+1);

            if (tChar.containsKey(c) && Objects.equals(currentWindowChar.get(c), tChar.get(c))) {
                count++;
            }

            if (!tChar.containsKey(s.charAt(left))) {
                left++;
            }

            while (count == tChar.size()) {
                if (ans.isEmpty() || right - left + 1 < ans.length()) {
                    ans = s.substring(left, right+1);
                }

                char leftChar = s.charAt(left);

                currentWindowChar.put(leftChar, currentWindowChar.getOrDefault(leftChar,0)-1);

                if (tChar.containsKey(leftChar) && currentWindowChar.get(leftChar) < tChar.get(leftChar)) {
                    count--;
                }
                left++;
            }

        }
        return ans;
    }
    static void main() {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
