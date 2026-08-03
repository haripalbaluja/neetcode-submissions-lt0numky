class MinStack {

    List<Integer> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        if(!stack.isEmpty()) {
            stack.remove(stack.size()-1);
        }
    }
    
    public int top() {
        if(!stack.isEmpty()) {
            return stack.get(stack.size()-1);
        }
        return 0;
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int num : stack) {
            min = Math.min(min, num);
        }
        return min;
    }
}
