class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> arrayMap = new HashMap<>();

       for(int i = 0; i < nums.length; i++) {
            arrayMap.put(nums[i],i);
       }

       for(int i = 0; i < nums.length; i++) {
        int difference = target - nums[i];

        if(arrayMap.containsKey(difference) && arrayMap.get(difference) != i) {
            return new int[]{i, arrayMap.get(difference)};
        }
       }

        return new int[]{0};
        
    }
}
