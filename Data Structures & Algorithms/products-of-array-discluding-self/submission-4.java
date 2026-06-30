class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int arrayProduct = 1;
        int zeroCount = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                arrayProduct *= nums[i];
            }
            else {
                zeroCount++;
            }
        }

        if(zeroCount > 1) {
            return output;
        }

        for(int i = 0; i < nums.length; i++) {
            if(zeroCount == 1) {
                if(nums[i] == 0) {
                    output[i] = arrayProduct;
                } else {
                    output[i] = 0;
                }
            } else {
                output[i] = arrayProduct/nums[i];
            }
        }

        return output;
    }
}  
