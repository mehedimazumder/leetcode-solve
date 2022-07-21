class MinStack {
    Stack<Long> st;
    Long min;
    
    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        Long v = Long.valueOf(val);
        if(st.isEmpty()){
            min = v;
            st.push(v);
            return;
        }
        if(v > min)
            st.push(v);
        else{
            st.push(2*v - min);
            min = v;
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        
        Long val = st.pop();
        if(val < min)
            min = 2*min - val;
    }
    
    public int top() {
        Long val = st.peek();
        if(val > min)
            return val.intValue();
        return min.intValue();
    }
    
    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */