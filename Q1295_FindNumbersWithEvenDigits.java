public class Q1295_FindNumbersWithEvenDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int i: nums) {
            int n = (int)Math.log10(i) + 1;

            if (n%2 == 0) {
                count++;
            }
        }
        return count;
    }
    static void main() {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
