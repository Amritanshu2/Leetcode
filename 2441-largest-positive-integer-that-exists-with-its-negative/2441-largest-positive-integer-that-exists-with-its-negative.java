class Solution {
    public int findMaxK(int[] n) {
        Arrays.sort(n);
        for(int i = n.length-1;i>=0;i--){
            int j = 0; int a = 0-n[i];
            while(j < n.length){
                if(a == n[j]){
                    return n[i];
                }j++;
            }
        }
        return -1;
    }
}