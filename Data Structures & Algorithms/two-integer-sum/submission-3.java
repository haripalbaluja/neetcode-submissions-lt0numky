class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> arrayMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            arrayMap.put(nums[i],i);
        }

        //nums[j] = nums[i] - target;

        for(int j = 0; j < nums.length; j++) {
            int value = target - nums[j];

            if(arrayMap.containsKey(value) && arrayMap.get(value) != j) {
                return new int[]{j, arrayMap.get(value)};
            }
        }
        return null;
    }
}
