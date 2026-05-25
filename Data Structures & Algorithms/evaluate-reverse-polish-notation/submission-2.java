class Solution {
    public int evalRPN(String[] tokens) {



        Deque<String> st = new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++){
            String s = tokens[i];
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int x = Integer.parseInt(st.pop());
                int y =Integer.parseInt(st.pop());
                   switch(s){
                    case "+":st.push(Integer.toString(x+y));
                    break;
                    case "-":st.push(Integer.toString(y-x));
                    break;
                    case "*":st.push(Integer.toString(x*y));
                    break;
                    default:st.push(Integer.toString(y/x));
                   }
            }
            else{
                st.push(s);
            }
        }
        return Integer.parseInt(st.pop());
    }
}
