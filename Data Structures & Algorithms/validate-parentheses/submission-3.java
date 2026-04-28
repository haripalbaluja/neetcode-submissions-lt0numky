class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();

        for(int i = 0; i < array.length; i++) {
            if(array[i] == '(' || array[i] == '{' || array[i] == '[') {
                stack.push(array[i]);
            }
            else if(array[i] == ')'  && !stack.isEmpty()&& stack.peek() == '(') {
                stack.pop();
            }
            else if(array[i] == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else if(array[i] == ']' && !stack.isEmpty() && stack.peek() == '[' ) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
