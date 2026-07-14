class Solution {
    public int trap(int[] height) {

        int result = 0;
        int[] leftMaxArray = new int[height.length];
        int[] rightMaxArray = new int[height.length];

        leftMaxArray[0] = height[0];
        rightMaxArray[height.length-1] = height[height.length-1];

        for(int i = 1; i < height.length; i++) {
            leftMaxArray[i] = Math.max(leftMaxArray[i-1], height[i]);
        }

        for(int i = height.length-2; i >= 0; i--) {
            rightMaxArray[i] = Math.max(rightMaxArray[i+1], height[i]);
        }

        for(int i = 0; i < height.length; i++) {
            result += Math.min(leftMaxArray[i], rightMaxArray[i]) - height[i];
        }
        return result;
        
    }
}
