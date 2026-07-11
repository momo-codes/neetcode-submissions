class Solution {
    public void backtrack(List<List<Integer>> ans, List<Integer> temp,int[] nums,int target,int sum,int start){
        if(sum>target){
            return;
        }
        if(sum==target){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(ans,temp,nums,target,sum+nums[i],i);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(ans,temp,nums,target,0,0);
        return ans;
    }
}
