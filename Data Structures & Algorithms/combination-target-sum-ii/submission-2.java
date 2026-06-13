class Solution {
    public void recurSum(int index,List<List<Integer>> ans, int[] candidates, List<Integer> ds, int target){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
       for(int i=index;i<candidates.length;i++){
            if(index<i && candidates[i]==candidates[i-1]){
                continue;
            }
            if(target<candidates[i]){
                break;
            }
            ds.add(candidates[i]);
            recurSum(i+1,ans,candidates,ds,target-candidates[i]);
            ds.remove(ds.size()-1);

         }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        int index=0;
        recurSum(0,ans,candidates,ds,target);
        return ans;
    }
}
//1,2,2,4,5,6,9