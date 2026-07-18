class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int minlen = nums.length+1;
        while(j<nums.length){
            sum+=nums[j];
            if(sum>=target){
                while(sum>=target){
                    int len = j-i+1;
                    minlen = Math.min(len,minlen);
                    sum-=nums[i];
                    i++;
                }
            }
            j++;
        }
        if(minlen==nums.length+1) return 0;
        return minlen;
    }
}