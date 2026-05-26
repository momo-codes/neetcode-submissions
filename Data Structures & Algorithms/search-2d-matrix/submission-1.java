class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(target<matrix[0][0]) return false;
        int row=matrix.length-1;
        for(int i=0;i<matrix.length-1;i++){
                int j = matrix[i][0];
                int k= matrix[i+1][0];
                if(target>=j && target<k){
                    row = i;
                }
        }

        int n =matrix[row].length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[row][mid] == target){
                return true;
            }

            else if(matrix[row][mid] > target){
                high--;
            }
            else{
                low++;
            }
        }
        return false;
    }
}
