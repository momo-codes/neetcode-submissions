class Pair{
    int node;
    int cost;
    Pair(int n, int c){
        node  = n;
        cost  = c;
    }
}
class Solution {
    public int cost(int x1, int x2 ,int y1, int y2){
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->a.cost - b.cost);
        // Map<Integer,int[]> map = new ArrayList<>();
        // for(int i =0;i<points.length;i++){
        //     map.put(i,point);
        // }
      
        boolean [] visited = new boolean[points.length];
        
        int[] minCost = new int[points.length];
        Arrays.fill(minCost,Integer.MAX_VALUE);
      
        q.add(new Pair(0,0));
        int tcost = 0;
        minCost[0] = 0;
        int edges = 0;
      
        while(!q.isEmpty()){
            Pair curr = q.remove();
            if(!visited[curr.node]){
                visited[curr.node] = true;
                tcost+=curr.cost;
                edges++;
                if(edges == points.length){
                    break;
                }
                int[] point = points[curr.node];
                for(int i =0;i<points.length;i++){
                    if(visited[i]){
                        continue;
                    }
                    int[] point2 = points[i];
                    int newCost = cost(point[0],point2[0],point[1],point2[1]);
                    if(newCost<minCost[i]){
                        minCost[i] = newCost;
                        q.add(new Pair(i,newCost));
                    }
                }
            }
        }
        return tcost;
    }
}
