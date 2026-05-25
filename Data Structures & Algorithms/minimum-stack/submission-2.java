class MinStack {

    Deque<Integer> st;
    Deque<Integer> minSt;

    public MinStack() {
        st = new ArrayDeque<>();
        minSt = new ArrayDeque<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minSt.isEmpty() || val<=minSt.peek()){
            minSt.push(val);
        }
    }
    
    public void pop() {
        if(st.peek().equals(minSt.peek())){
            minSt.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
