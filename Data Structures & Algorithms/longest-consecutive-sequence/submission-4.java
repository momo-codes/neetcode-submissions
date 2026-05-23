class Solution {
    public int longestConsecutive(int[] nums) {
        
            int n = nums.length;
            if(n==0)return 0;
            Set<Integer> set = new HashSet<>();
            for(int val:nums){
                set.add(val);
            }
            int longest = 1;
            int count=1;
            for(int it:set){
                if(set.contains(it-1)){
                    continue;
                }
                else{
                    while(set.contains(it+1)){
                        count++;
                        it=it+1; 
                    }
                    if(count>longest){
                        longest=count;
                    };
                    count=1;
                }
            }
        return longest;

    }
}
