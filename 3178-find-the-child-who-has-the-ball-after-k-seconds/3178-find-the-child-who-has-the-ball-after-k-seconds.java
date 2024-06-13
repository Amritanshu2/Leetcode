class Solution {
    public int numberOfChild(int n, int k) {
        int i = 0;int m = 0;int a = 0;
        while(m<k){
            if(i%2 == 0){a++;}
            else{a--;}m++;
            if(a == 0 || a == n-1){i++;}
        }
        return a;
    }
}