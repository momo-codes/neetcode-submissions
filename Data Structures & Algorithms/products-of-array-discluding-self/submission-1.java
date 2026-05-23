class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int[] prefixStart = new int[n], prefixEnd = new int[n], res =new int[n];

        prefixStart[0] = nums[0];
        for(int i=1;i<n;i++){
            prefixStart[i]=prefixStart[i-1]*nums[i];
        }

        prefixEnd[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            prefixEnd[i] = prefixEnd[i+1]*nums[i];
        }

        res[0] = prefixEnd[1];
        res[n-1] = prefixStart[n-2];
        for(int i=1;i<n-1;i++){
            res[i]=prefixStart[i-1]*prefixEnd[i+1];
        }
        return res;
    }
}  
