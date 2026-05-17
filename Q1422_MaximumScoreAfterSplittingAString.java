public class Q1422_MaximumScoreAfterSplittingAString {
    public static int maxScore(String s) {
        int totalOneSum = 0, maxSum = 0, leftSum = 0;

        for (char c: s.toCharArray()) {
            if (c == '1') {
                totalOneSum++;
            }
        }

        if (s.charAt(0) == '0') {
            leftSum++;
        }
        else {
            totalOneSum--;
        }

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            maxSum = Math.max(maxSum, leftSum + totalOneSum);

            if (c == '0') {
                leftSum++;
            }
            else {
                totalOneSum--;
            }

        }

        return maxSum;
    }
    static void main() {
        String str = "00";
        System.out.println(maxScore(str));
    }
}
