class Solution {
    int[][] dp;
    private int helper(int i,int j,char[] r,char[] k,int[][][] lidx,int[][][] ridx){
        if(j>=k.length || i>=r.length)return 0;
        if(dp[i][j]!=0)return dp[i][j];
        int left = lidx[i][k[j]-'a'][1] + helper(lidx[i][k[j]-'a'][0],j+1,r,k,lidx,ridx);
        int right = ridx[i][k[j]-'a'][1] + helper(ridx[i][k[j]-'a'][0],j+1,r,k,lidx,ridx);
        return dp[i][j] = Math.min(left,right);
    }
    private int[] findBestR(int i,char[] r,char ch){
        int c=0,n=r.length;
        while(r[i]!=ch){
            i = (i+1)%n;
            c++;
        }
        return new int[]{i,c+1};
    }
    private int[] findBestL(int i,char[] r,char ch){
        int c=0,n=r.length;
        while(r[i]!=ch){
            i = (i-1);
            if(i<0){
                i=n-1;
            }
            c++;
        }
        return new int[]{i,c+1};
    }
    public int findRotateSteps(String ring, String key) {
        char[] r = ring.toCharArray();
        char[] k = key.toCharArray();
        Set<Character> chrs = new HashSet<>();
        for(char c:k){
            chrs.add(c);
        }

        System.out.println(chrs);
        int[][][] lidx = new int[r.length][26][2];
        int[][][] ridx = new int[r.length][26][2];

        for(int i=0;i<r.length;i++){
            for(char c:chrs){
                lidx[i][c-'a'] = findBestL(i,r,c);
                ridx[i][c-'a'] = findBestR(i,r,c);
            }
        }
        dp = new int[r.length][k.length];
        return helper(0,0,r,k,lidx,ridx);
    }
}