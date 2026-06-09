class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int []> minHeap = new PriorityQueue<>(
            (a,b)-> a[0]!=b[0]? a[0]-b[0] : a[1]-b[1]
        );

        for(int i=0;i<nums.length;i++){
            minHeap.offer(new int[]{nums[i],i});
        }

        while(k>0){
            int[] min = minHeap.poll();
            nums[min[1]]=multiplier*min[0];
            minHeap.offer(new int[]{nums[min[1]],min[1]});
            k--;
        }
        return nums;
    }
}