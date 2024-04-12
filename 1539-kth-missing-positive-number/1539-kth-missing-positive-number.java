class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = 1;
        for(int i = 0;i<arr.length;i++){
            while(arr[i]>n){
                n++;k--;
                if(k == 0){return n-1;}}
           n++;
        }
        while(k!=0){
            n++;k--;
        }
        return n-1;
    }
}