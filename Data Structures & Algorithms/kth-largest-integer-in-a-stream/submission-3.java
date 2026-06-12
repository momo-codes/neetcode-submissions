class KthLargest {
    int k;
    PriorityQueue<Integer> q ;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.q = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
            if(q.size()>k){
                q.poll();
            }
        }
    }
    
    public int add(int val) {
        q.add(val);
       if(q.size()>k){
        q.poll();
       }
        return q.peek();
    }
}
