class Solution {
    public int longestConsecutive(int[] nums) {
        int length = 1;
        int maxLength = 1;
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]+1) {
                length++;
                maxLength = Math.max(length, maxLength);
            } else if(nums[i] == nums[i-1]) {
                continue;
            } else {
                length = 1;
            }
        }
        return maxLength;
    }
}
