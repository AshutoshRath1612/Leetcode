public class Q2540_MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0, n1 = nums1.length, n2 = nums2.length;

        while (i < n1 && j < n2) {
            while (i < n1 && j < n2 && nums1[i] < nums2[j]) {
                i++;
            }

            while (i < n1 && j < n2 && nums1[i] > nums2[j]) {
                j++;
            }

            if (i < n1 && j < n2 && nums1[i] == nums2[j]) {
                return nums1[i];
            }
        }
        return -1;
    }
    static void main() {
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,3};
        System.out.println(getCommon(nums1, nums2));
    }
}
