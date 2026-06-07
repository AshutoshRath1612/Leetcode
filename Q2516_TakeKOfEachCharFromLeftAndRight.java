public class Q2516_TakeKOfEachCharFromLeftAndRight {
    public static int takeCharacters(String s, int k) {
        int [] freq = new int[3];

        for (char c: s.toCharArray()) {
            freq[c - 'a']++;
        }

        if (Math.min(freq[0], Math.min(freq[1], freq[2])) < k) {
            return -1;
        }

        int min = Integer.MAX_VALUE, left = 0;

        for (int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            freq[c - 'a']--;

            while (Math.min(freq[0], Math.min(freq[1], freq[2])) < k) {
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            min = Math.min(min, s.length() - (right - left + 1));
        }

        return min;
    }
    static void main() {
        String s = "aabaaaacaabc";
        int k = 2;
        System.out.println(takeCharacters(s,k));
    }
}
