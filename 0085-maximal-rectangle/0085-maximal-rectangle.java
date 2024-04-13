class Solution {
    public int maximalRectangle(char[][] mat) {
        int[][]matrix = new int[mat.length][mat[0].length];
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                matrix[i][j] = mat[i][j]-'0';
            }
        }
        
        for(int i = 1;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 1){
                    matrix[i][j] = matrix[i-1][j]+1;
                } 
            }
        }
        int max = 0;
        for(int i = 0;i<matrix.length;i++){
            max = Math.max(max,maxA(matrix[i]));
        }
        return max;
    }
    
    public int maxA(int[]arr){
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            int a = checkL(arr,i-1,arr[i]);
            int b = checkR(arr,i+1,arr[i]);
            max = Math.max(max,(a+b+1)*arr[i]);
        }
        return max;
    }
    
    public int checkL(int[]arr, int i, int a){
        int b = 0;
        while(i>=0 && arr[i]>=a){
            i--;b++;
        }
        return b;
    }
    
    public int checkR(int[]arr, int i, int a){
        int b = 0;
        while(i<arr.length && arr[i]>=a){
            i++;b++;
        }
        return b;
    }
}