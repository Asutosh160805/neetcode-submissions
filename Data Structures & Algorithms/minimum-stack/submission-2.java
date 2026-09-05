class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    int min;
    
    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (minst.isEmpty() || minst.peek() > val) minst.push(val);
        else minst.push(minst.peek()); 
    }
    
    public void pop() {
        st.pop();
        minst.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}
