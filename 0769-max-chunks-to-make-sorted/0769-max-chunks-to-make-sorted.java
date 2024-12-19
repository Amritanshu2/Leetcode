class Solution {
    public int maxChunksToSorted(int[] arr) {
        int tot = 0;
        for (int i = 0; i < arr.length; i++) {
            tot++;
            i = hlpr(arr, i);
        }
        return tot;
    }

    public int hlpr(int[] arr, int i) {
        int m = i;
        while(i<=m){
            for(int j = arr.length-1;j>=i;j--){
                if(arr[j]<arr[i]){m = Math.max(m,j);break;}
            }
            i++;
        }
        return m;
    }
}
