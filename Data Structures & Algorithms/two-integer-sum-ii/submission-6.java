class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for(int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i+1, map.get(complement)+1};
            }
        }
        return null;
    }
}
