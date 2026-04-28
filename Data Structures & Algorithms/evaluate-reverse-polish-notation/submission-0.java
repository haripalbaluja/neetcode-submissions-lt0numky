class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if(s.equals("+") && !stack.isEmpty()) {
                int num1 = Integer.valueOf(stack.pop());
                int num2 = Integer.valueOf(stack.pop());
                int result = num1+num2;
                stack.push(String.valueOf(result));
            }
            else if(s.equals("-") && !stack.isEmpty()) {
                int num1 = Integer.valueOf(stack.pop());
                int num2 = Integer.valueOf(stack.pop());
                int result = num2-num1;
                stack.push(String.valueOf(result));
            }
            else if(s.equals("*") && !stack.isEmpty()) {
                int num1 = Integer.valueOf(stack.pop());
                int num2 = Integer.valueOf(stack.pop());
                int result = num1*num2;
                stack.push(String.valueOf(result));
            }
            else if(s.equals("/") && !stack.isEmpty()) {
                int num1 = Integer.valueOf(stack.pop());
                int num2 = Integer.valueOf(stack.pop());
                int result = num2/num1;
                stack.push(String.valueOf(result));
            }
            else {
                stack.push(s);
            }
        }
        return Integer.valueOf(stack.peek());
    }
}
