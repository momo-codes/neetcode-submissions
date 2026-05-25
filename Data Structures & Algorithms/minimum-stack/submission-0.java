class MinStack {
   Deque<Integer> st;
     public MinStack() {
        st = new ArrayDeque<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
         st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int[] arr = new int[st.size()];
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                arr[i] = st.pop();
                min=arr[i];
                }
            else{
            arr[i] = st.pop();
            min = Math.min(arr[i],min);
        }
        }
        for(int i=arr.length-1;i>=0;i--){
            st.push(arr[i]);
        }
       return min;
    }
}