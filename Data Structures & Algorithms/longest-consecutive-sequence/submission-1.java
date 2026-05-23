class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length ==0) return 0;
        Arrays.sort(nums);
        int n =nums.length;
        int[] freq = new int[n];

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
                freq[j] = count;
                count=1;
                j++;
            }
        }
        freq[j] = count;

    Arrays.sort(freq);
    return freq[n-1];

    }
}
