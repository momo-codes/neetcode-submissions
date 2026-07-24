class Solution {
    public boolean isValid(int mid, int p, int[] nums){
        int count =0;
        int i = 0;
        while(i<nums.length-1){
            if(nums[i+1]-nums[i] <=mid){
                count++;
                i+=2;
            }
            else{
                i++;
            }
        }
        return count>=p;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int s = 0;
        int e = nums[nums.length - 1]-nums[0];
        int result = 0;
        while(s<=e){
            int mid =  s+ (e-s)/2;
            if(isValid(mid,p, nums)){
                result = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return result;
    }
}