class Solution {
    public void dfs(char[][] grid,boolean[][] visited,int row,int col,int n, int m,int[][] direction){
if(row<0 || row>=n || col<0 || col>=m) return;
        if(visited[row][col]==true || grid[row][col]=='0') return;
        visited[row][col] = true;
      

      for(int[] dir: direction){
        dfs(grid,visited,row+dir[0],col+dir[1],n,m,direction);
      }
    }
    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
       boolean[][] visited = new boolean[n][m];
       int count=0;
       int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
       for(int i=0;i<n;i++){
        for (int j=0;j<m;j++){
            if(grid[i][j] =='1' && visited[i][j] ==false){
                dfs(grid,visited,i,j,n,m,direction);
                count++;
            }
        }
       }
       return count;
    }
}
