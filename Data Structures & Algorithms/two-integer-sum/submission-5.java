class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> arrayMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            arrayMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int value = target - nums[i];

            if(arrayMap.containsKey(value) && arrayMap.get(value) != i) {
                return new int[] {i, arrayMap.get(value)};
            }
        }
          return new int[] {-1,-1};
    }
}
