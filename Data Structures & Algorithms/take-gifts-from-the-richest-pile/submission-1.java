class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift: gifts){
            q.add(gift);                    //100,64,25,9,4
        }
        while(k>0){
            int i = (int)Math.sqrt(q.poll());       //i=5     9,8,5,4,3  k=0
            q.add(i);                                   
            k--;
        }
        long sum=0;
        while(q.size()!=0){
            sum+=q.poll();
        }

        return sum;
    }
}