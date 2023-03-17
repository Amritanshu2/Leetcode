class Solution {
    public void rotate(int[][] arr) {
        int [][] car = new int [arr.length][arr.length];
        
                for(int m = 0,i=0;m<arr.length && i<arr.length;m++,i++){
                    for(int n = arr.length-1,j=0 ; n>=0 && j<arr.length ;n-- ,j++){
                        int temp = arr[i][j];
                        car[i][j]=arr[n][m];
                    }
                }
           
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                arr[i][j] = car[i][j];
            }
        }
    }
}