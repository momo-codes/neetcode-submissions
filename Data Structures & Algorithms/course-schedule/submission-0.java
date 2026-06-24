class Solution {
    public boolean isCycle(List<Integer>[] adj,boolean[] visited,boolean[] rec,int curr){
        visited[curr]=true;
        rec[curr]=true;

        for(int i=0;i<adj[curr].size();i++){
            if(!visited[adj[curr].get(i)]){
                if(isCycle(adj,visited,rec,adj[curr].get(i))){
                    return true;
                }
            }
            if(visited[adj[curr].get(i)] && rec[adj[curr].get(i)]){
                return true;
            }
        }
        rec[curr]=false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer> [] adj =new ArrayList[numCourses];
        for(int i =0 ;i<numCourses;i++){
            adj[i] = new ArrayList<>();
        }

        for(int i=0;i<prerequisites.length;i++){
            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            adj[prereq].add(course);
        }

        boolean [] visited = new boolean[numCourses];
        boolean[] rec = new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(isCycle(adj,visited,rec,i)){
                    return false;
                }
            }
        }
        return true;
    }
}
