class MinStack {

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if(!stack.isEmpty()) {
            stack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()) {
            return stack.peek();
        }
        return 0;
    }
    
    public int getMin() {
        int minimum = Integer.MAX_VALUE;
        Stack<Integer> secondStack = new Stack<>();
        while(!stack.isEmpty()) {
            int popped = stack.pop();
            minimum = Math.min(minimum, popped);
            secondStack.push(popped);
        }
        while(!secondStack.isEmpty()) {
            stack.push(secondStack.pop());
        }
        return minimum;
    }
}
