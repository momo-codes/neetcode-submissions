class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    // for O(logm*n)  2D --> 1D

    int n = matrix.length;
    int m = matrix[0].length;

    int s = n*m;

    int low =0;
    int high = s-1;
    while(low<=high){
        int mid = low + (high-low)/2;
        if(matrix[mid/m][mid%m] == target){
            return true;
        }

        else if(matrix[mid/m][mid%m] > target){
            high = mid-1;
        }
        else{
            low = mid+1;
        }
    }
    return false;

    }
}
