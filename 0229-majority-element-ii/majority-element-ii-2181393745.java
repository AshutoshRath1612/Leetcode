class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i: nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for(Integer k: freq.keySet()) {
            if (freq.get(k) > nums.length/3) {
                result.add(k);
            }
        }

        return result;
    }
}
