class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nse = new int[heights.length];
        int[] pse = new int[heights.length];
        Stack<Integer> nseStack = new Stack<>();
        Stack<Integer> pseStack = new Stack<>();

        for(int i = heights.length-1; i>= 0; i--) {
            while(!nseStack.isEmpty() && heights[nseStack.peek()] >= heights[i]) {
                nseStack.pop();
            }
            if(nseStack.isEmpty()) {
                nse[i] = heights.length;
            } else {
                nse[i] = nseStack.peek();
            }
            nseStack.push(i);
        }

        for(int i = 0; i < heights.length; i++) {
            while(!pseStack.isEmpty() && heights[pseStack.peek()] >= heights[i]) {
                pseStack.pop();
            }
            if(pseStack.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = pseStack.peek();
            }
            pseStack.push(i);
        }

        int maxArea = Integer.MIN_VALUE;

        for(int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nse[i] - pse[i] - 1;
            int area = height*width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;

    }
}
