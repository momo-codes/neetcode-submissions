class Solution {
    public void backtrack(List<List<Integer>> ans,List<Integer> temp,boolean[] visited,int[] nums){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            temp.add(nums[i]);
            backtrack(ans,temp,visited,nums);
            visited[i]=false;
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(ans,temp,visited,nums);
        return ans;
    }
}
