class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
            O(n^2) solution by having a loop inside loop and for every i, searching for j where i+j==target
            not going to implement that one
        */
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i); //add value and index of array elements
        }

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                int j = map.get(complement);
                if(j < i) {
                    result[0] = j;
                    result[1] = i;
                } else {
                    result[0] = i;
                    result[1] = j;
                }
                return result;
            }
        }
        return result;
        // space complexity = O(n), storing elements in hashmap, time complexity = O(n)
    }
}
