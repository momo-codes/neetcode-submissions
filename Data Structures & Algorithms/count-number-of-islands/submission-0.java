class Solution {
    public void dfs(char[][] grid,boolean[][] visited,int row,int col,int n, int m){
if(row<0 || row>=n || col<0 || col>=m) return;
        if(visited[row][col]==true || grid[row][col]=='0') return;
        visited[row][col] = true;
        dfs(grid,visited,row+1,col,n,m);
        dfs(grid,visited,row,col+1,n,m);
        dfs(grid,visited,row-1,col,n,m);
        dfs(grid,visited,row,col-1,n,m);
    }
    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
       boolean[][] visited = new boolean[n][m];
       int count=0;
       for(int i=0;i<n;i++){
        for (int j=0;j<m;j++){
            if(grid[i][j] =='1' && visited[i][j] ==false){
                dfs(grid,visited,i,j,n,m);
                count++;
            }
        }
       }
       return count;
    }
}
