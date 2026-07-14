class Solution {
    public int sqSum(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            n = n/10;
            sum+=digit*digit;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            int sqSum = sqSum(n);
            if(sqSum==1){
                return true;
            }
            if(set.contains(sqSum)){
                return false;
            }
            set.add(sqSum);
            n = sqSum;
        }
        return true;
    }
}
