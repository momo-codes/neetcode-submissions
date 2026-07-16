class Solution {
    public boolean isPalindrome(String s,int i,int j,int[][] dp){
        if(i>=j){
            dp[i][j] = 1;
            return true;
        }
        if(dp[i][j]!=-1) return dp[i][j]==0?false:true;
        if(s.charAt(i)==s.charAt(j)){
            boolean b= isPalindrome(s,i+1,j-1,dp);
            dp[i][j] = b?1:0;
            return b;
        }
        else{
            dp[i][j] = 0;
            return false;
        }
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int [][] dp = new int[n][n];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        int count=0;
        for(int i = 0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j,dp)) count++;
            }
        }
        return count;
    }
}
