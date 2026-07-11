class Solution {
    public int get(int n,int pos){
       return (n>>pos)&1;
    }
    public int update(int n,int pos,int num ){
        int bitmask = 1<<pos;
        if(num==0){
            n = ~(bitmask)&n; 
        }
        if(num==1){
            n = n|bitmask;
        }
        return n;
    }

    public int reverseBits(int n) {
        int i = 0;
        int j = 31;
        while(i<j){
            int x = get(n,i);
            int y =get(n,j);
            if(x==y){
                i++;
                j--;
                continue;
            }
            else{
                n = update(n,i,y);
                n = update(n,j,x);
                i++;
                j--;
            }
        }
        return n;
    }
}
