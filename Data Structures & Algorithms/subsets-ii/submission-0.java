class Solution {
    public void backtrack(List<List<Integer>> res,int[] nums,List<Integer> tempSet,int start){
        res.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            tempSet.add(nums[i]);
            backtrack(res,nums,tempSet,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res,nums,new ArrayList<>(),0);
        return res;
    }
}
