class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> resultList = new ArrayList<>();
        int[] result = new int[nums.length-k+1];

        for (int i = 0; i <= nums.length - k; i++) {
            int maxWindowNum = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                maxWindowNum = Math.max(maxWindowNum, nums[j]);
            }
            result[i] = maxWindowNum;
        }
        return result;
    }
}
