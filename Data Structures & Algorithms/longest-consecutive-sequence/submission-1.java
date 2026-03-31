class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int consecutive = 1;
        int longestConsecutive = 1;

        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            
            if(nums[i] == nums[i-1]) {
                continue;
            }

            if(nums[i] == nums[i-1]+1) {
                consecutive++;
                longestConsecutive = Math.max(longestConsecutive, consecutive);
            } else {
                consecutive = 1;
            }
        }

        return longestConsecutive;
    }
}
