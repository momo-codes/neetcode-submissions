class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;

        for(int num:nums){
            i=i^num;
        }
        return i;
    }
}