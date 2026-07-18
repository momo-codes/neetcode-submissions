class Solution {
    public int lcs(String s1,String s2,int i,int j,int[][] dp){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return  dp[i][j] = 1+lcs(s1,s2,i-1,j-1,dp);
        }
        return dp[i][j]=Math.max(lcs(s1,s2,i-1,j,dp),lcs(s1,s2,i,j-1,dp)); 
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return lcs(text1,text2,n-1,m-1,dp);
    }
}
