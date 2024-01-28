class Solution {
    HashMap<Integer,Integer>hm = new HashMap<>();
    public int trd(int n){
        if(hm.containsKey(n)){return hm.get(n);}
        if(n==1 || n==2){return 1;}
        if(n==0){return 0;}
        int m = trd(n-3) + trd(n-1) + trd(n-2);
        hm.put(n,m);
        return m;
    }
    
    public int tribonacci(int n) {
        return trd(n);
    }
}