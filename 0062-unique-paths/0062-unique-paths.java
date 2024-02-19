class Solution {
    int[][]arr ;
    public int uniquePaths(int m, int n) {
        arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = -1; // Fill each element with zero
            }
        }
        return path(m,n,0,0);
    }
    
    public int path(int m, int n, int i, int j){
        if(i ==m-1 && j == n-1){return 1;}
        if(arr[i][j]!=-1){return arr[i][j];}
        if(i != m-1 && j!= n-1){
            int a = path(m,n,i+1,j);
            int b = path(m,n,i,j+1);
            return arr[i][j] = a+b;
        }
        if(i!=m-1){
            return arr[i][j] = path(m,n,i+1,j);
        }
        else{
            return arr[i][j] = path(m,n,i,j+1);
        }
    }
}