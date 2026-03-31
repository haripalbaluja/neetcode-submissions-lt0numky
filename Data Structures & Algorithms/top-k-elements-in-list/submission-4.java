class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for(int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }

        List<int[]> array = new ArrayList<>();

        for(Map.Entry<Integer,  Integer> map : frequencyMap.entrySet()) {
            array.add(new int[]{map.getValue(), map.getKey()});
        }

        array.sort((a,b) -> b[0] - a[0]);

        int[] result = new int[k];

        for(int i = 0; i < k ; i++) {
            result[i] = array.get(i)[1];
        }

        return result;
    }
}
