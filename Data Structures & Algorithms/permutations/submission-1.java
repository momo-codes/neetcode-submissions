class Solution {
    public void recurrPermute(int index,int[] nums,List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(ds);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            recurrPermute(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    public void swap(int i, int index, int[] nums){
        int temp = nums[i];
        nums[i]= nums[index];
        nums[index] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurrPermute(0,nums,ans);
        return ans;
    }
}
