class Solution {
    public boolean isPerfectSquare(int n){
        int sqrt = (int)(Math.sqrt(n));
        return (sqrt*sqrt == n);
    }
    // public int sqSum(int n,int[] dp){
    //     if(isPerfectSquare(n)) return  1;
    //     if(dp[n]!=-1) return  dp[n];
    //         int min = Integer.MAX_VALUE;
    //     for(int i = 1;i*i<=n;i++){
    //         int sum = 1 + sqSum(n-(i*i),dp);
    //         min = Math.min(min,sum);
    //     }
    //     return dp[n] =min;
    // }
    public int numSquares(int n) {
        if(n==0)return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            if(isPerfectSquare(i)) dp[i]=1;
            else{
                int min = Integer.MAX_VALUE;
                for(int j=1;j*j<=i;j++){
                    int sum = dp[j*j] + dp[i-j*j];
                    min = Math.min(sum,min);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }
}