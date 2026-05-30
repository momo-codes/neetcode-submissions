class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()) return false;
        if( t.length()==0) return false;
        if(s.length()==0) return true;
         
        char[] str=s.toCharArray();
        int j=0;

        for(char c:t.toCharArray()){
            if(c== str[j]){
                j++;
            }
            if(j==s.length()){
                return true;
            }
        }
        return false; 
    }
}