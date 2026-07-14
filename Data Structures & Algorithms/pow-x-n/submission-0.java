class Solution {
    public double myPow(double x, int n) {
        // return Math.pow(x,n);
        double ans = 1.00000;
        double base = x;
        if(n<0){
            base = 1/x;
            n = -n;
        }
        while(n>0){
            int last = n&1;
            if(last==1){
                ans*=base;
            }
            base*=base;
            n=n>>1;
        }
        return ans;
    }
}
