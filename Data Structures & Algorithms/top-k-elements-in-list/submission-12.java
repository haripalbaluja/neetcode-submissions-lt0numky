class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int[] result = new int[k];

        for(int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i],0)+1);
        }
        List<int[]> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> map : freqMap.entrySet()) {
            list.add(new int[]{map.getValue(), map.getKey()});
        }

        //abra ca dabra sorting magic code
        Collections.sort(list, (a,b) -> b[0] - a[0]);

        for(int i = 0; i < k; i++) {
            result[i] = list.get(i)[1];
        }
        return result;

    }
}
