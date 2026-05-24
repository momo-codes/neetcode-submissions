class Solution {
    public boolean isValid(String s) {

        if(s.length()==1)return false;
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Deque<Character> st = new ArrayDeque<>();

        for(char c:s.toCharArray()){
            if(c=='{'|| c=='(' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                if(st.pop()!=map.get(c)){
                    return false;
                }
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}
