class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0;i<32;i++){
            int bit = 1&(n>>i);
            if(bit==1){
                res = res|(1<<(31-i));
            }
        }
        return res;
    }
}
