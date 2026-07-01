class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->{
            int ac = Math.abs(a-x);
            int bc = Math.abs(b-x);
            if(ac==bc){
                return b-a;
            }
            return bc-ac;
            });
        for(int a:arr){
            q.add(a);
            if(q.size()>k){
                q.remove();
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.remove());
        }
       Collections.sort(ans);
       return ans;
    }
}