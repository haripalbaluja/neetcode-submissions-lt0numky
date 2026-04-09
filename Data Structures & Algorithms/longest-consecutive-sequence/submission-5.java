class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int seq = 1;
        int maxSeq = 1;
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]+1) {
                seq++;
                maxSeq = Math.max(seq, maxSeq);
            }
            else if(nums[i] == nums[i-1]) {
                continue;
            } else {
                seq = 1;
            }
        }
        return maxSeq;
    }
}
