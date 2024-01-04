class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);int k = 0;int ans = 0;
        for(int i = 0;i<g.length;i++){
            for(int j = k;j<s.length;j++){
                if(s[j]>=g[i]){
                    k = j+1;ans++;break;
                }
            }
        }
        return ans;
    }
}