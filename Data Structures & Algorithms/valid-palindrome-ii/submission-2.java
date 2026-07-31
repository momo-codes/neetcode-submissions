class Solution {
    public boolean isPal(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i= 0;
        int j= s.length()-1;
        int k=1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isPal(s,i+1,j) || isPal(s,i,j-1);
            }
            else{
                 i++;
                 j--;
            }
        }
          return true;
    }
}