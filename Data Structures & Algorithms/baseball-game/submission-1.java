class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        if(n==1){
            return Integer.parseInt(operations[0]);
        }

        Deque<Integer> st = new ArrayDeque<>();
        for(String s: operations ){
            if(s.equals("+")||s.equals("C")||s.equals("D")){
                if(s.equals("+")){
                    int i = st.pop();
                    int j = st.pop();
                    st.push(j);
                    st.push(i);
                    st.push(i+j);
                }
                else if(s.equals("D")){
                    st.push(2*st.peek());
                }
                else{
                    st.pop();
                }
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }

        int sum=0;

        while(!st.isEmpty()){
            sum +=st.pop();
        }

        return sum;
    }
}//5,-2,-4,9,5,14