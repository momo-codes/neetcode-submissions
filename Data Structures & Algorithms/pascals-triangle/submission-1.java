class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ans = new ArrayList<>();
    for(int i=1;i<=numRows;i++){
        List<Integer> temp = new ArrayList<>();
        for(int j = 0;j<i;j++){
            if(j==0 || j==i-1){
                temp.add(1);
            } 
            else{
                temp.add(ans.get(i-2).get(j-1) + ans.get(i-2).get(j));
            }
        }
        ans.add(temp);
    }
    return ans;
    }
}