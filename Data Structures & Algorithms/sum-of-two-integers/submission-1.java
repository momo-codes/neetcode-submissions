class Solution {
    public int get(int n,int pos){
        return 1 & (n>>pos);
    }
    public void set(int n , int pos){
        n = n|(1<<pos);
        return;
    }
    public int getSum(int a, int b) {
        int carry = 0;
        int n = 0;
        for(int i=0;i<32;i++){
            int b1 = get(a,i);
            int b2 = get(b,i);

            if(b1==1 && b2==1){
                if(carry==1){
                   n = n|(1<<i);
                }
                carry=1;
            }
            else{
                if(carry==0){
                    int b3 = b1^b2;
                    if(b3==1){
                        n = n|(1<<i);
                    }
                }
                else{
                    if(b1==1 || b2==1){
                        carry=1;
                    }
                    else{
                       n = n|(1<<i);
                        carry=0;
                    }
                }
            }
        }
        return n;
    }
}
