class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int temp = nums[0];
        for(int i =1;i<nums.length-1;i++){
            if(temp == nums[i]){
                return temp;
            }
            temp=nums[i];
        }
        return temp;
    }
}
