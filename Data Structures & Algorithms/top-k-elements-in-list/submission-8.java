class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*
        1. create a hashmap of frequency of array elements
        2. get the values - frequency list, sort it in descending order
        3. for the k values, while iterating over hashmap, get the keys
        */
        Map<Integer, Integer> hashmap = new HashMap<>();
        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {
            hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0) + 1);
        }

        List<int[]> freqList = new ArrayList<>();

        for(Map.Entry<Integer, Integer> map : hashmap.entrySet()) {
            freqList.add(new int[] {map.getValue(), map.getKey()});
        }

        freqList.sort((a,b) -> b[0] - a[0]);
        for(int i = 0; i < k; i++) {
            result[i] = freqList.get(i)[1];
        }


        return result;
    }
}
