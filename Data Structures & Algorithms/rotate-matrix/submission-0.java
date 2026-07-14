class Tuple{
    int val;
    int row;
    int col;
    Tuple(int val,int row,int col){
        this.val = val;
        this.row = row;
        this.col =col;
    }

}
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int k=0;
        Tuple[] arr = new Tuple[n*n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                int val = matrix[i][j];
                int row = j;
                int col = n-1-i;
                arr[k] = new Tuple(val,row,col);
                k++; 
            }
        }
        for(int i = 0;i<n*n;i++){
            int val = arr[i].val;
            int row = arr[i].row;
            int col = arr[i].col;
            matrix[row][col] = val;
        }
    }
}
