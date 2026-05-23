class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int profit =0;
        int min = prices[0];
        for(int i=1;i<n;i++){
            int temp = prices[i]-min;
            profit = Math.max(temp,profit);
            min = Math.min(min,prices[i]);
        }

        return profit;
    
    }
}
