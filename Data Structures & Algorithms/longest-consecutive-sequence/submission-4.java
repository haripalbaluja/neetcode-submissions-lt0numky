class Solution {
    public int longestConsecutive(int[] nums) {
        //2,3,4,4,5,10,20
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxLength = 1;
        int length = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1] + 1) {
                length++;
                maxLength = Math.max(maxLength, length);
            } else if(nums[i] == nums[i-1]) {
                continue;
            } else {
                length = 1;
            }
        }
        return maxLength;
    }
}
