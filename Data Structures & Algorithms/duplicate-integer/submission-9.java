class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> set = new ArrayList<>();

        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}