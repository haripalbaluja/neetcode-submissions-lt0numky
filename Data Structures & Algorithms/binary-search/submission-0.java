class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        return binarySearch(low, high, nums, target);
    }

    public int binarySearch(int low, int high, int[] nums, int target) {
        if(low > high) {
            return -1;
        }
        int middle = (low+high)/2;
        if(nums[middle] == target) {
            return middle;
        }
        else if(target > nums[middle]) {
           return binarySearch(middle+1, high, nums, target);
        }
        else {
            return binarySearch(low, middle-1, nums, target);
        }
    }
}
