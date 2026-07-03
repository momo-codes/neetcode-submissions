class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0;
        int j=0;
        double avg;
        int sum=0;
        int count=0;
        while(j<arr.length){
            int size=j-i+1;
            sum+=arr[j];
            if(size<k){
                j++;
                continue;
            }
            avg = (double) sum/size;
            if(avg>=threshold){
                count++;
            }
            sum-=arr[i];
            j++;
            i++;
        }
        return count;
    }
}