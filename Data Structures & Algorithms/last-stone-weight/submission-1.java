class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            q.add(stone);                           //2,1    O(NlogN)
        }
        while(q.size()>1){
            int a =q.poll();                    
            int b=q.poll();                         // a=2 b=1  1
            if(Math.abs(a-b)!=0){                      
                q.add(Math.abs(a-b));               
            }
        }
        if(q.size()==0){
            return 0;
        }
        else{
            return q.poll();
        }
    }
}
