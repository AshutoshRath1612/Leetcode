class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer, Integer> freq = new HashMap<>();
      int n = nums.length;

      for (int i: nums) {
        freq.put(i, freq.getOrDefault(i, 0) + 1);

        if (freq.get(i) > n/2) {
            return i;
        }
      }   

      return -1;
    }
}
