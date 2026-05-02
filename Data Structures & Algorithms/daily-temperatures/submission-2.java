class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] result = new int[length];
        Stack<int[]> stack = new Stack<>();
        //0 temp , 1 index
        for(int i = length-1; i>= 0; i--) {
            while(!stack.isEmpty() && stack.peek()[0] <= temperatures[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = stack.peek()[1] - i;
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
