class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        int digits = (int)((Math.log(n)/Math.log(10))+1);
        long sum = 0;
        long factor = (int)Math.pow(10,digits-1);
        while(n>0){
            int digit = n%10;
            n = n/10;
            sum+=(factor*digit);
            factor/=10;
        }
        if(x<0){
            if(sum>Math.pow(2,31)){
                return 0;
            }
            else{
                return (0- (int)(sum));
            }
        }
        if(sum>Math.pow(2,31)-1){
            return 0;        
            }
            return (int)sum;
    }
}
