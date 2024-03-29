class Solution {
    HashMap<Integer,Integer>hs = new HashMap<>();
    public int numTrees(int n) {
        if(n<=1){return 1;}
        if(hs.containsKey(n)){return hs.get(n);}
        int ans = 0;
        for(int i = 1;i<=n;i++){
            ans += numTrees(i-1) * numTrees(n-i);
        }
        hs.put(n,ans);
        return ans;
    }
}