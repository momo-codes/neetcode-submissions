class Solution {
    public int minCost(int[] cost,int[] dp,int idx){
        if(idx>=cost.length){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];

        return dp[idx] = cost[idx]+Math.min(minCost(cost,dp,idx+1), minCost(cost,dp,idx+2));
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,dp,0),minCost(cost,dp,1));
    }
}
