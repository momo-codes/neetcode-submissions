// using dfs

class Solution {
    public boolean dfs(int u,int v, boolean[] visited,Map<Integer,List<Integer>> map){
        visited[u] = true;
        if(u==v){
            return true;
        }
        for(int i=0;i<map.getOrDefault(u,new ArrayList<>()).size();i++){
            int n = map.get(u).get(i);
            if(visited[n]){
                continue;
            }
            if(dfs(n,v,visited,map)){
                return true;
            }
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            boolean[] visited = new boolean[n+1];
            if(map.containsKey(u) && map.containsKey(v) && dfs(u,v,visited,map)){
                return edge;
            }
            else{
               List<Integer> ulist = map.getOrDefault(u,new ArrayList<>());
               ulist.add(v);
               map.put(u,ulist);

               List<Integer> vlist = map.getOrDefault(v,new ArrayList<>());
               vlist.add(u);
               map.put(v,vlist);

            }
        }
        return new int[]{};
    }
}
