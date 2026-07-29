class Solution {
    class Pair{
        int dest;
        int wt;
        Pair(int dest, int wt){
            this.dest = dest;
            this.wt = wt;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<Pair> [] graph = new List[n+1];
        for(int i = 1;i<=n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0;i<times.length;i++){
            int src= times[i][0];
            int dest= times[i][1];
            int wt = times[i][2];
            graph[src].add(new Pair(dest,wt));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.wt-b.wt);
        pq.add(new Pair(k,0));
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] =0;
        boolean[] visited = new boolean[n+1];
        int time =Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!visited[curr.dest]){
                visited[curr.dest] = true;
                for(int i = 0;i<graph[curr.dest].size();i++){
                    Pair e = graph[curr.dest].get(i);
                    int src = curr.dest;
                    int dest = e.dest;
                    if(curr.wt + e.wt<dist[dest]){
                        dist[dest] = curr.wt + e.wt;
                        pq.add(new Pair(dest,dist[dest]));
                    }
                }

            }
        }
        for(int i=1;i<dist.length;i++){
            time = Math.max(time,dist[i]);
        }
        if(time==Integer.MAX_VALUE) return -1;
        return time;
    }
}
