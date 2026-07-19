class Solution {
    public long sum(int k){
        return (((long)k*(k+1))/2);
    }
    public int arrangeCoins(int n) {
        int s = 1;
        int e = n;

        while(s<=e){
            int mid = s+(e-s)/2;
            long currSum = sum(mid);
            if(currSum==n){
                return mid;
            }
            else if(currSum<n){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return e;
    }
}