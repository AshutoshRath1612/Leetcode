class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i<nums.length-2; i++){
            if (i>0 && nums[i] == nums[i-1]){
              continue;
            }
            int left = i+1, right = nums.length-1;
            while (left < right) {
                int triplet = nums[i] + nums[left] + nums[right];
                if(triplet == 0) {
                List<Integer> sum = new ArrayList<>();
                    sum.add(nums[i]);
                    sum.add(nums[left]);
                    sum.add(nums[right]);
                    result.add(sum); 
                    right--;
                    while (left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
                else if (triplet < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
}
