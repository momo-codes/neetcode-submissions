class Solution {
    class Tup{
        int node;
        int wt;
        int stops;
        Tup(int node, int wt, int stops){
            this.node = node ;
            this.wt =  wt;
            this.stops=stops;
        }
    }
    class Pair{
        int node;
        int wt;
        Pair(int node, int wt){
            this.node =  node;
            this.wt = wt;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<Pair> [] graph = new ArrayList[n];
        for(int i = 0 ; i< n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i =0;i<flights.length;i++){
            int s = flights[i][0];
            int d = flights[i][1];
            int wt = flights[i][2];
            graph[s].add(new Pair(d,wt));
        }
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] =0;
        PriorityQueue<Tup> pq = new PriorityQueue<>((a,b)->a.stops-b.stops);
        pq.add(new Tup(src,0,0));
        while(!pq.isEmpty()){
            Tup curr = pq.remove();
                for(int i = 0;i<graph[curr.node].size();i++){
                    Pair e = graph[curr.node].get(i);
                    int dest =e.node;
                    if(curr.wt+e.wt<dist[dest] && curr.stops<=k){
                        dist[dest] = curr.wt+e.wt;
                        pq.add(new Tup(dest,dist[dest],curr.stops+1));
                    }
                }
            

        }
        int ans = dist[dst];
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}
