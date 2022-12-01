class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0;i<matrix.length;i++){
            if(matrix[i][matrix[0].length-1]>=target){
                for(int i1= 0;i1<matrix[0].length;i1++){
                    if(matrix[i][i1]==target){
                        return true;
                    }
                }
                return false;
            }
            
        }
        return false;
    }
}