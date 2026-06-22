class Solution {

    public void backtrack(List<List<Integer>> res, int[] nums,List<Integer> tempSet,int start){
        res.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++){// [{},{1},{1,2},{1,2,3},{1,3},{2},{2,3},{3}]
            tempSet.add(nums[i]);
            backtrack(res,nums,tempSet,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,nums,new ArrayList<>(),0);
        return res;
    }
}
