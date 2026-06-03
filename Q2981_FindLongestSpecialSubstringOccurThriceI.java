import java.util.HashMap;
import java.util.Map;

public class Q2981_FindLongestSpecialSubstringOccurThriceI {
    public static int maximumLength(String s) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int index = i;
            char c = s.charAt(i);
            while (index < s.length() && s.charAt(index) == c ){
                hm.put(s.substring(i, index+1), hm.getOrDefault(s.substring(i,index+1),0)+1);
                index++;
            }
        }
        int minLength = -1;
        for (Map.Entry<String, Integer> entry: hm.entrySet()) {
            if (entry.getValue() >= 3) {
                minLength = Math.max(entry.getKey().length(), minLength);
            }
        }
        return minLength;
    }
    static void main() {
        String str = "aaaa";
        System.out.println(maximumLength(str));
    }
}
