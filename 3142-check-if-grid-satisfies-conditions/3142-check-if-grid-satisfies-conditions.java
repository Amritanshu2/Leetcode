class Solution {
    public boolean satisfiesConditions(int[][] a) {
        for(int j=0;j<a[0].length-1;j++){
            if(a[0][j]==a[0][j+1]){
                return false;
            }
        }
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]!=a[0][j]){
                    return false;
                }
                if(j<a.length-1){
                    if(j+1<a[0].length && a[i][j]==a[i][j+1]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}