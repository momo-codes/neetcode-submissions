class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int i= 2;

        while(i*i<=num){
             if(i*i==num){
                return true;
             }
             if(i*i>num){
                return false;
             }
             i++;
        }

        return false;
    }
}