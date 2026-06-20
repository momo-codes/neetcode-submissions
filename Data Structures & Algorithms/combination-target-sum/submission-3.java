class Solution {
    public void recurSum(int index,List<List<Integer>> ans ,int[] nums,List<Integer> ds,int target){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(index==nums.length || target<0){
            return;
        }
        if(target>=nums[index]){
            ds.add(nums[index]);
            recurSum(index,ans,nums,ds,target-nums[index]);
            ds.remove(ds.size()-1);
        }
        recurSum(index+1,ans,nums,ds,target);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds =  new ArrayList<>();
        recurSum(0,ans,nums,ds,target);
        return ans;
    }
}
