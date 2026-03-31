class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int zeroCount = 0;
        int arrayProduct = 1;

        for(int num : nums) {
            if(num != 0){
                arrayProduct = arrayProduct * num;
            } else {
                zeroCount++;
            }
        }

        if(zeroCount > 1) {
            return result;
        }

        for(int i = 0; i < nums.length; i++) {
            if(zeroCount == 1) {
                if(nums[i] == 0) {
                    result[i] = arrayProduct;
                } else {
                    result[i] = 0;
                }
            }
            else {
                result[i] = arrayProduct/nums[i];
            }
        }

        return result;
    }
}  
