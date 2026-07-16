class Solution {
    public boolean isPalindrome(String s , int i , int j,int[][]dp){
        if(i>=j){
            dp[i][j]=1;
            return true;
        }
        if(dp[i][j]!=-1) return dp[i][j]==0?false:true;
        if(s.charAt(i)==s.charAt(j)){
            boolean b = isPalindrome(s,i+1,j-1,dp);
            dp[i][j]= b?1:0;
            return b;
        }
        else{
            dp[i][j] = 0;
            return false;
        }
    }
    public String longestPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        int maxLen = Integer.MIN_VALUE;
        int start=0;
        for(int i = 0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j,dp) && maxLen<j-i+1){
                    maxLen=j-i+1;
                    start = i;
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
}
