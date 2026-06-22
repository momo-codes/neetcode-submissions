class Solution {
    public void backtrack(List<List<Integer>> res, List<Integer> tempSet,int[] nums,boolean[] isThere){
        if(tempSet.size() == nums.length){
            res.add(new ArrayList<>(tempSet));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(isThere[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !isThere[i-1]){
                continue;
            }
            isThere[i] = true;
            tempSet.add(nums[i]);
            backtrack(res,tempSet,nums,isThere);
            isThere[i]=false;
            tempSet.remove(tempSet.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] isThere = new boolean[nums.length];
        Arrays.sort(nums);
        
        backtrack(res,new ArrayList<>(),nums,isThere);
        return res;
    }
}