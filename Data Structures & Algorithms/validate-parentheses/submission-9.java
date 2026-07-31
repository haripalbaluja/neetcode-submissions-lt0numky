class Solution {
    public boolean isValid(String s) {
        /*
            create a stack of type Character
            iterate over the string s
            if current character is opening bracket, insert it in stack e.g '(' , '['. '{'

            if current character is closing bracket and stack is not empty
            check if top of stack is corresponding opening bracket, if yes
            , pop from the stack e.g ')' , ']', '}'

            return stack.isEmpty();
        */
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' | ch == '{') {
                stack.push(ch);
            }
            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();

                if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
