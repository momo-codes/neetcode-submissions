class Solution {
    public int maxLoot(int[] nums,int[] dp,int idx){
        if(idx>=nums.length){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        int steal = nums[idx]+ maxLoot(nums,dp,idx+2);
        int skip = maxLoot(nums,dp,idx+1);

        return dp[idx] = Math.max(steal,skip);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return maxLoot(nums,dp,0);
    }
}
