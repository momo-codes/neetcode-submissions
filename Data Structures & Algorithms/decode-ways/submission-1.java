class Solution {
    public boolean isValid(String s){
        int n = Integer.parseInt(s);
        if(n>9 && n<27){
            return true;
        }
        return false;
    }
    public int decode(String s,int[] dp,int i){
        if(i==s.length()) return dp[i]= 1;
        if(dp[i]!=-1) return dp[i];
        if(s.charAt(i)=='0') return dp[i]= 0;
        int single = decode(s,dp,i+1);
        int doub = 0;
        if(i+1<s.length()){
            if(isValid(s.substring(i,i+2))){
                doub = decode(s,dp,i+2);
            }
        }
        return dp[i]=single+doub;
    }
    public int numDecodings(String s) {
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return decode(s,dp,0);
    }
}
