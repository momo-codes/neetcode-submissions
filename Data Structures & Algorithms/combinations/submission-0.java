class Solution {
    public void backtrack(List<List<Integer>> res, int n,List<Integer> tempSet,int start,int k){
        if(tempSet.size()==k){
            res.add(new ArrayList<>(tempSet));
            return;
        }
        for(int i= start ; i<=n;i++){
            tempSet.add(i);
            backtrack(res,n,tempSet,i+1,k);
              tempSet.remove(tempSet.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,n,new ArrayList<>(),1,k);
        return res;
    }
}