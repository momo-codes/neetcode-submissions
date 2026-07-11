class Solution {
    public int get(int n , int pos){
        int bitmask = 1<<pos;
        if((bitmask&n)!=0){
            return 1;
        }
        return 0;
    }
    public int hammingWeight(int n) {
        int count=0;
        for(int i = 0;i<32;i++){
            if(get(n,i)==1){
                count++;
            }
        }
        return count;
    }
}
