class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                stack.push(token);
            }
            else if (token.equals("+")) {
                Integer num1 = Integer.valueOf(stack.pop());
                Integer num2 = Integer.valueOf(stack.pop());
                Integer result = num1 + num2;
                stack.push(String.valueOf(result));
            }
            else if (token.equals("-")) {
                Integer num1 = Integer.valueOf(stack.pop());
                Integer num2 = Integer.valueOf(stack.pop());
                Integer result = num2 - num1;
                stack.push(String.valueOf(result));
            }
            else if (token.equals("*")) {
                Integer num1 = Integer.valueOf(stack.pop());
                Integer num2 = Integer.valueOf(stack.pop());
                Integer result = num1 * num2;
                stack.push(String.valueOf(result));
            }
            else if (token.equals("/")) {
                Integer num1 = Integer.valueOf(stack.pop());
                Integer num2 = Integer.valueOf(stack.pop());
                Integer result = num2 / num1;
                stack.push(String.valueOf(result));
            }
        }
        return Integer.valueOf(stack.peek());
    }
}
