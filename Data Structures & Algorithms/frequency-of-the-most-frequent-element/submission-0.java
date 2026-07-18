class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int freq= 1;
        int i= 0;
        int j = 1;
        int sum=nums[0];
        while(j<nums.length){
            sum+=nums[j];
            while(((nums[j]*(j-i+1))-sum)>k){
                sum-=nums[i];
                i++;
            }
             int len = j-i+1;
             freq = Math.max(len,freq);
            
            j++;
        }
        return freq;
    }
}