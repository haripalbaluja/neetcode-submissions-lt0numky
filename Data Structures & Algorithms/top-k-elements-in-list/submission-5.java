class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);
        }

        List<int[]> freqPair = new ArrayList<>();
        for(Map.Entry<Integer, Integer> map : frequency.entrySet()) {
            freqPair.add(new int[]{map.getValue(), map.getKey()});
        }

        freqPair.sort((a,b) -> b[0] - a[0]);
        int[] result = new int[k];

        for(int i = 0; i < k; i++) {
            result[i] = freqPair.get(i)[1];
        }
        return result;


    }
}
