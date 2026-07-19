class Solution {
    public int minOperations(String[] logs) {
     Deque<Integer> st = new ArrayDeque<>();
     for(int i =0;i<logs.length;i++){
        if(logs[i].equals("../")){
            if(!st.isEmpty()){
                st.pop();
            }
        }
        else if(logs[i].equals("./")){
            continue;
        }
        else{
            st.push(i);
        }
     }   
     return st.size();
    }
}