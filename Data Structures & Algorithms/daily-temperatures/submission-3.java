class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        if(temperatures.length ==1) return res;

        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<temperatures.length;i++){
            
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                    int k = st.pop();
                    res[k] = i-k;
            }
            st.push(i);
            }
        

        return res;
    }
}



//30,38,30,36,35,40,28