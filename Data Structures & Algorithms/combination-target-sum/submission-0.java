class Solution {
    public void recurrSum(int index,int sum,int[] nums,List<List<Integer>> ans,int target,List<Integer> ds){
        if(sum==target){
            ans.add(new ArrayList<>(ds));
            return ;
            
        }
        if(sum>target){
            return;
        }
        for(int i=index;i<nums.length;i++){
            sum+=nums[i];
            ds.add(nums[i]);
            recurrSum(i,sum,nums,ans,target,ds);
             ds.remove(ds.size()-1);
             sum-=nums[i];
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds =  new ArrayList<>();
        int index=0;
        int sum =0;
        recurrSum(index,sum,nums,ans,target,ds);
        return ans;
    }
}
