class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                int[] arr = new int[2];
                if(i < map.get(complement)) {
                    arr[0] = i;
                    arr[1] = map.get(complement);
                } else {
                    arr[0] = map.get(complement);
                    arr[1] = i;
                }
                return arr;
            }
        }
        return null;
    }
}
