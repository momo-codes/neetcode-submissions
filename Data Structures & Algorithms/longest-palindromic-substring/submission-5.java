class Solution {
    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int lps(String s,int[][] dp,int i,int j){
        if(i==j){
            return dp[i][j] =1;
        }
        if(dp[i][j]!=0) return dp[i][j];
        if(isPalindrome(s.substring(i,j+1))){
            return dp[i][j] = j-i+1;
        }
        return dp[i][j] = lps(s,dp,i,j-1);
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int maxLen = Integer.MIN_VALUE;
        int st = 0;
        for(int i = 0;i<n;i++){
            int len = lps(s,dp,i,n-1);
            if(len>maxLen) {
                maxLen = len;
                st = i;
            }
        }
        return s.substring(st,st+maxLen);
        
    }
}
