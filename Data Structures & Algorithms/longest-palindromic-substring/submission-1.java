class Solution {
    public boolean isPalindrome(String s){
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a!=b) return false;
            i++;
            j--;
        }
        return true;
    }
    public String lps(String s,String [][] dp,int i,int j){
        if(i+1==j){
            return dp[i][j-1] =  s.substring(i,j);
        }
        if(dp[i][j-1].length()!=0) return dp[i][j-1];

        if(isPalindrome(s.substring(i,j))){
            return dp[i][j-1] = s.substring(i,j);
        }
        String s1 = lps(s,dp,i,j-1);
        String s2 = lps(s,dp,i+1,j);

        return dp[i][j-1] = Math.max(s1.length(),s2.length())==s1.length()?s1:s2;


    }
    public String longestPalindrome(String s) {
        String [][] dp = new String [s.length()][s.length()];
       for(String[] str : dp){
        Arrays.fill(str,"");
       }
        return lps(s,dp,0,s.length());
    }
}
