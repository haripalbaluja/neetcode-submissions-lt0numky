class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        /*
            iterate over the string as a char array
            if there's an opening bracket, ( [ {, push it onto stack
            if after above statement, stack is empty, return false
            if there's a closing bracket, and corresponding opening bracket on top, pop the top
           element else if for each type of opening and closing bracket and last else would cover
           the case when there's a closing bracket but opening bracket is different then return
           false, outside loop return stack.isEmpty();
        */

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            if (ch == ')' || ch == ']' || ch == '}') {
                if(stack.isEmpty()) {
                    return false;
                }
                if (ch == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (ch == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (ch == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
