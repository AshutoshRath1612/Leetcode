public class Q7_ReverseInteger {
    public static int reverse(int x) {
        long rev = 0;

        while (x != 0) {
            rev = rev * 10 + x%10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
            x = x/10;
        }
        return (int)rev;
    }
    static void main() {
        int num = -123;
        System.out.println(reverse(num));
    }
}
