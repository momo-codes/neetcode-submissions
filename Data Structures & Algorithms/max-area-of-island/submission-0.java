class Solution { 
    public void dfs(int[][] grid, int n, int m,boolean[][] visited,int row,int col,int[] length, int[][] directions){
        visited[row][col] = true;
        length[0]++;
        for(int i=0;i<4;i++){
            int nrow = row + directions[i][0];
            int ncol = col+directions[i][1];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                && !visited[nrow][ncol] && grid[nrow][ncol]!=0){
                    dfs(grid,n,m,visited,nrow,ncol,length,directions);
             }
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        //dfs
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        int[][] directions = {{-1,0},{0,1},{1,0},{0,-1}};
        int max = 0;
        int[] length = {0};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]!=0){
                    dfs(grid,n,m,visited,i,j,length, directions);
                    max = Math.max(max,length[0]);
                    length[0]=0;
                }
            }
        }

        return max;
    }
}
