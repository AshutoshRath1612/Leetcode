import java.util.HashMap;

public class Q424_LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int maxLength = 0, left = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            hm.put(s.charAt(right), hm.getOrDefault(s.charAt(right), 0 )+1);

            maxFreq = Math.max(hm.get(s.charAt(right)), maxFreq);

            while ((right - left + 1) - maxFreq > k) {
                hm.put(s.charAt(left), hm.getOrDefault(s.charAt(left++), 0) - 1);
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static int characterReplacement1(String s, int k) {
        int maxLength = 0, left = 0, maxFreq = 0;
        int [] letters = new int[26];

        for (int right = 0; right < s.length(); right++) {
            letters[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, letters[s.charAt(right) - 'A']);
            
            while (right - left + 1 - maxFreq > k) {
                letters[s.charAt(left++) - 'A']--;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    static void main() {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement1(s, k));
    }
}
