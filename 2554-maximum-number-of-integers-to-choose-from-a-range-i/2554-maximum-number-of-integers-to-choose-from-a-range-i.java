class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer>hs = new HashSet<>();
        for(int i = 0;i<banned.length;i++){
            hs.add(banned[i]);
        }
        int sum = 0;int num = 0;
        for(int i = 1;i<=n;i++){
            if(!hs.contains(i) && sum+i <= maxSum){sum += i;num++;}
            if(sum+i > maxSum){return num;}
        }
        return num;
    }
}