class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(arr[i],-1);
        }
        int i = 1;int k = 0;int j= 0;
        while(i<=n*n){
            while(k<n && j<n && arr[k][j] == -1){
                arr[k][j++] = i++;
            }
            j--;k++;
            while(j<n && k<n && arr[k][j] == -1){
                arr[k++][j] = i++;
            }
            k--;j--;
            while(k>=0 && j>=0 && arr[k][j] == -1){
                arr[k][j--] = i++;
            }
            j++;k--;
            while(j>=0 && k>=0 && arr[k][j] == -1){
                arr[k--][j] = i++;
            }k++;j++;
        }
        return arr;
    }
}