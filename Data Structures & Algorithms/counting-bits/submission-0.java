class Solution {
    public int find(int n,int pos){
        int bitmask = 1<<pos;
        if((bitmask&n)!=0){
            return 1;
        }
        return 0;
    }
    public int count(int n){
        int count=0;
        for(int i=0;i<32;i++){
            if(find(n,i)==1){
                count++;
            }
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<ans.length;i++){
            ans[i] = count(i);
        }
        return ans;
    }
}
