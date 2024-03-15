class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        int[]arr= new int[cells.length];
        n = n%14;
        if(n == 0){n = 14;}
        for(int j = 0;j<n;j++){
            
            for(int i = 0;i<8;i++){
                if(i == 0 || i == cells.length-1){arr[i] = 0;}
                else{
                if(cells[i-1] == cells[i+1]){arr[i] = 1;}
                else{arr[i] = 0;}
                }
            }
            cells = Arrays.copyOf(arr,arr.length);
            
        }
        return cells;
    }
}