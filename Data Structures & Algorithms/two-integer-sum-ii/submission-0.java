class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0;
        int j=n-1;
        int k =target;
int sum;
        while(i<j){
          sum =    numbers[i]+numbers[j];
            if(sum>k){
                j--;
            }
            else if(sum<k){
                i++;
            }
            else{
                return  new int[]{i+1,j+1};
            }
        }
        return  new int[]{0,0};
    }
}
