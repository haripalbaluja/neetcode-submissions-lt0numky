class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];

                if(threeSum > 0) {
                    right--;
                }
                else if(threeSum < 0) {
                    left++;
                }
                else if(threeSum == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }                   
                    while(left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
