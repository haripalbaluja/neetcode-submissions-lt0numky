class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
        // int left = 0;
        // int right = nums.length -1;


        // while(left < right) {
        //     int sum = nums[left] + nums[right];

        //     if(sum < target) {
        //         left++;
        //     }
        //     else if(sum > target) {
        //         right--;
        //     } 
        //     else if(sum == target) {
        //         return new int[] {left, right};
        //     }
        // }
        // return null;

    }
}
