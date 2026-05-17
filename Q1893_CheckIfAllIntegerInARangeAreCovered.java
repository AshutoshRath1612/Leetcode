public class Q1893_CheckIfAllIntegerInARangeAreCovered {
    public static boolean isCovered(int[][] ranges, int left, int right) {
        int[] intervalFrequency = new int[right - left + 1];

        for (int[] r : ranges) {
            for (int i = r[0]; i <= r[1]; i++) {
                if (i >= left && i <= right) {
                    intervalFrequency[i - left]++;
                }
            }
        }
        for (int i : intervalFrequency) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }
    static void main() {
        int [][] arr = {{1,2},{3,4},{5,6}};
        int left = 2, right = 5;
        System.out.println(isCovered(arr,left,right));
    }
}
