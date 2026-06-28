public class Q3614_ProcessStringWithSpecialOperationII {
    public static char processStr(String s, long k) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else if (c == '#') {
                sb.append(sb);
            }
            else if (c == '%') {
                sb.reverse();
            }
            else {
                sb.append(c);
            }
        }
        return k > sb.length() - 1 || sb.length() == 0? '.' : sb.charAt((int)(k));
    }
    static void main() {
        String str = "fwp*m*#a%%";
        int k = 5;
        System.out.println(processStr(str, k));
    }
}
