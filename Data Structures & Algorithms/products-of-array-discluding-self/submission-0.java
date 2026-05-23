class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count =0;
        for(int val:nums){
            if(val==0){
                count++;
            }
        }
        int[] res = new int[nums.length];
        if(count>1)return res;

        int product =1;
        for(int val:nums){
            if(val == 0)continue;
            product=product*val;
        }

        for(int i=0;i<nums.length;i++){
            if(count ==1){
                if(nums[i]==0){
                    res[i]=product;
                }
            }
            else{
                res[i]=product/nums[i];
            }
            
        }
        return res;
    }
}  
