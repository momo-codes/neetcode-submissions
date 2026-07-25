class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] ==0){
                    q.add(new int[]{i,j});     
                }
            }
        }
        int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                int[] curr = q.poll();
                for(int j=0;j<4;j++){
                    int nrow = curr[0]+direction[j][0];
                    int ncol = curr[1]+direction[j][1];
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol] == Integer.MAX_VALUE){
                        grid[nrow][ncol]=grid[curr[0]][curr[1]]+1;
                        q.add(new int[]{nrow,ncol});   
                    }
                }
            }
        }
    }
}
