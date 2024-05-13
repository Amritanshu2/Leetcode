class Solution {
    public int matrixScore(int[][] grid) {
        for(int i = 0;i<grid.length;i++){
            if(grid[i][0]==0){
                grid = changeRow(grid,i);
            }
        }
        for(int i = 1;i<grid[0].length;i++){
            int No = 0,N1 = 0;
            for(int j = 0;j<grid.length;j++){
                if(grid[j][i] == 0){No++;}
                else{N1++;}
            }
            if(N1<No){grid = changeCol(grid,i);}
        }
        int sum = 0;
        for(int i = 0;i<grid.length;i++){
            String s = "";
            for(int j = 0;j<grid[0].length;j++){
                s+=grid[i][j];
            }
            sum += binaryToDecimal(s);
        }
        return sum;
    }
    
    public int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            char digit = binary.charAt(i);
            if (digit != '0' && digit != '1') {
                throw new IllegalArgumentException("Invalid binary digit: " + digit);
            }
            decimal = (decimal << 1) | (digit - '0');
        }
        return decimal;
    }
    
    public int[][] changeCol(int[][]arr, int col){
        for(int i = 0;i<arr.length;i++){
            if(arr[i][col] == 0){arr[i][col] = 1;}
            else{arr[i][col] = 0;}
        }
         return arr;
    }
    
    public int[][] changeRow(int[][]arr , int row){
        for(int i = 0;i<arr[0].length;i++){
            if(arr[row][i] == 0){arr[row][i] = 1;}
            else{arr[row][i] = 0;}
        }
        return arr;
    }
}