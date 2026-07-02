class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            int sum = -nums[i];
            int j =i+1;
            int k= n-1;

            while(j<k){
                int s = nums[j]+nums[k];
                if(s<sum){
                    j++;
                }
                else if(s>sum){
                    k--;
                }
                else{
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[k]);
                    if(!res.contains(li)){
                    res.add(li);}
                    j++;
                    k--;
                }
            }
        }
        return res;
    }
}
