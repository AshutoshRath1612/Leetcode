package Leetcode;

public class Q67_AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, n1 = a.length(), n2 = b.length();
        char carry = '0';

        while (i >= 0 || j >= 0) {
            String sum = calculateSum(i >= 0 ? a.charAt(i) : '0', j>=0 ? b.charAt(j) : '0', carry);

            if (sum.length() == 2) {
                carry = sum.charAt(0);
                sb.insert(0,sum.charAt(1));
            }
            else {
                sb.insert(0, sum.charAt(0));
                carry = '0';
            }
            i--;
            j--;
        }
        if (carry == '1') {
            sb.insert(0, carry);
        }
        return sb.toString();
    }

    public static String calculateSum(char a, char b, char carry) {
        int count = 0;

        if (a == '1') {
            count++;
        }
        if (b == '1') {
            count++;
        }
        if (carry == '1') {
            count++;
        }

        switch (count) {
            case 0 -> {
                return "0";
            }
            case 1 -> {
                return "1";
            }
            case 2 -> {
                return "10";
            }
            case 3 -> {
                return "11";
            }
        }
        return "";
    }

    public static String addBinary2(String a, String b) {
        int i = a.length()-1, j = b.length()-1, carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j>= 0 || carry > 0) {
            if (i>=0) {
                carry += a.charAt(i--) - '0';
            }
            if (j>= 0) {
                carry += b.charAt(j--) - '0';
            }
            sb.insert(0, carry%2);
            carry = carry/2;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String a = "11", b = "10";
        System.out.println(addBinary(a,b));
    }
}
