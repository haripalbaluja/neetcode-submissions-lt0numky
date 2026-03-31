class Solution {
    public boolean hasDuplicate(int[] nums) {
        //optimal solution

        Map<Integer, Integer> frequency = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;

    }
}