import java.util.HashMap;

public class Q525_ContiguousArray {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxLength = 0;
        int sum  = 0;
        hm.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum--;
            }
            else{
                sum++;
            }
            if (hm.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - hm.get(sum));
            }
            else {
                hm.put(sum, i);

            }
        }
        return maxLength;
    }
    static void main() {
        int [] arr = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(arr));
    }
}
