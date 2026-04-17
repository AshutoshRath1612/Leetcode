package Leetcode;

public class Q202_HappyNumber {
    public static boolean isHappy(int n) {
        int slowPointer = nextNumber(n);
        int fastPointer = nextNumber(nextNumber(n));

        while (slowPointer != fastPointer) {
            if (fastPointer == 1)
                return true;
            slowPointer = nextNumber(slowPointer);
            fastPointer = nextNumber(nextNumber(fastPointer));
        }

        return slowPointer == 1;
    }
    public static int nextNumber(int n) {
        int nextNumber = 0;

        while (n > 0) {
            nextNumber += (int) Math.pow(n%10, 2);
            n = n/10;
        }
        return nextNumber;
    }

    public static boolean isHappy2(int n) {
        if (n == 1)
            return true;

        if (n <= 4)
            return false;

        int num = 0;

        while (n > 0) {
            num += (int) Math.pow(n%10,2);
            n /= 10;
        }

        if (num == 1)
            return true;

        return isHappy2(num);
    }
    public static void main(String[] args) {
        System.out.println(isHappy2(2));
    }
}
