class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length;i++){
            if(find(matrix[i],target))return true;
        }
        return false;
    }

    public boolean find(int []arr, int tar){
        int i = 0;
        int j = arr.length-1;
        int mid = (i+j)/2;

        while(j>=i){
            if(arr[mid] == tar)return true;
            if(arr[mid] > tar)j = mid-1;
            else{
                i = mid+1;
            }
            mid = (i+j)/2;
        }
        return false;
    }
}