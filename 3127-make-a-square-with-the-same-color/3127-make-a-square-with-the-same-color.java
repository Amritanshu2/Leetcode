class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i = 0;i<grid.length-1;i++){
            for(int j = 0;j<grid[0].length-1; j++){
                if(chk(grid,i,j)){return true;}
            }
        }
        return false;
    }
    
    public boolean chk(char[][] arr, int i, int j){
        int w = 0,b = 0;
        for(int d = 0;d<2;d++){
            for(int f = 0;f<2;f++){
                if(arr[i+d][j+f] == 'B'){b++;}
                else{w++;}
            }
        }
        if(b>=3 || w>=3){return true;}
        return false;
    }
}