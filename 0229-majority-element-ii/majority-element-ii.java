class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i: nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);

            if (freq.get(i) > nums.length/3 && !result.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
