class Solution {
    public int paths(int[][] dp,int m ,int n){
        if(m==-1 || n==-1) return 0;
      if(m==0 && n==0) return dp[m][n]=1;
      if(dp[m][n]!=-1) return dp[m][n];
      int right = paths(dp,m,n-1);
      int down = paths(dp,m-1,n);
      return dp[m][n]= right + down;
      
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }

        return paths(dp,m-1,n-1);
      
    }
}
