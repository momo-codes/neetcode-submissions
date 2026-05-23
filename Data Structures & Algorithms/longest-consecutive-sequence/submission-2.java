class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length ==0) return 0;
        Arrays.sort(nums);  // tc =O(nlogn)
        int n =nums.length;
        int max =1;

        int count = 1;
        int j=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1]+1){
                count++;
            }
            else{
                if(count>max){
                    max = count;
                }
                count=1;
                
            }
        }
        if(count>max){
            max=count;
        }

    return max;

    }
}
