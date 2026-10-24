class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i: nums1) {
            hs.add(i);
        }

        List<Integer> al = new ArrayList<>();

        for (int i: nums2) {
            if (hs.contains(i)) {
                al.add(i);
                hs.remove(i);
            }
        }

        int [] result = new int[al.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = al.get(i);
        }

        return result;
    }
}
