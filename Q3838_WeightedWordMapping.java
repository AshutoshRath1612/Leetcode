public class Q3838_WeightedWordMapping {
    public static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for (String word: words) {
            int totalWeight = 0;

            for (char c: word.toCharArray()) {
                totalWeight += weights[c - 'a'];
            }

            sb.append((char)('z' - (totalWeight%26)));
        }
        return sb.toString();
    }
    static void main() {
        String [] words = {"abcd","def","xyz"};
        int [] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
    }
}
