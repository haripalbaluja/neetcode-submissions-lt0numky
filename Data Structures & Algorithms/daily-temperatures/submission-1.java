class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] result = new int[length];

        Stack<int[]> stack = new Stack<>(); //pair - temperature, index

        for(int i = 0; i < length; i++) {
            int temp = temperatures[i];
            while(!stack.isEmpty() && temp > stack.peek()[0]) {
                int[] top = stack.pop();
                int diff = i - top[1];
                result[top[1]] = diff;
            }
            stack.push(new int[]{temp,i});
        }
        return result;
    }
}
