class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longestConsecutiveSeq = 1;
        int longestSeq = 1;

        if(nums.length == 0) {
            return 0;
        }

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1] + 1) {
                longestConsecutiveSeq += 1;
                longestSeq = Math.max(longestSeq, longestConsecutiveSeq);
            }
            else if(nums[i] == nums[i-1]) {
                continue;
            }
            else if(nums[i] != nums[i-1]) {
                longestConsecutiveSeq = 1;
            }
        }
        return longestSeq;
    }
}
